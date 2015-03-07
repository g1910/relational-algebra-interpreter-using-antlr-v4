package interpreter;

import java.util.ArrayList;
import interpreter.RelAlgebraParser.CartesianContext;
import interpreter.RelAlgebraParser.NaturalContext;
import interpreter.RelAlgebraParser.NestedContext;
import interpreter.RelAlgebraParser.ProjectContext;
import interpreter.RelAlgebraParser.RelationContext;
import interpreter.RelAlgebraParser.SelectContext;
import interpreter.RelAlgebraParser.SimpleContext;

/*
 *  The class RelAlgebraInterpreter inherits from the RelAlgebraBaseVisitor
 *  which specifies a visitor function for each rule specified in the grammar.
 *  This visitor function is called when a substring of the input is parsed according
 *  to this rule. The context or the substring which is parsed by this rule is
 *  passed as a parameter which may further contain children contexts associated 
 *  with even smaller substring.
 *  
 *  The visit function of this class calls the appropriate visit function associated
 *  with the root of the parse tree generated and control recursively goes down the parse tree
 *  with appropriate visit functions called at each step
 */
public class RelAlgebraInterpreter extends RelAlgebraBaseVisitor<String> {

	//count is required to generate dummy names for use with 'as'
	int count = 0;
	//to check whether the given expression is nested in some other expression
	boolean nested = false;
	
	//visitSelect converts selection expression
	@Override
	public String visitSelect(SelectContext ctx) {
		// TODO Auto-generated method stub
		boolean nesting = nested;
		String predicate = ctx.PREDICATE().getText();
		if (predicate.length() > 2)
			predicate = predicate.substring(1, predicate.length() - 1);
		else
			predicate = "true";

		String relation = visit(ctx.relation());

		String subQuery = "SELECT * FROM " + relation + " WHERE " + predicate ;
		
		String query;
		if(nesting){
			query = "( " + subQuery + " ) " + " as rel" + count++;
		}else{
			query = subQuery;
		}
		return query;
	}

	//visitProject converts projection expression
	@Override
	public String visitProject(ProjectContext ctx) {
		// TODO Auto-generated method stub
		boolean nesting = nested;
		String attributes = ctx.PREDICATE().getText();
		if(attributes.length() > 2)
			attributes = attributes.substring(1,attributes.length() - 1);
		else
			attributes = "*";
		
		String relation = visit(ctx.relation());
		
		String subQuery = "SELECT " + attributes + " FROM " + relation ;
		
		String query;
		if(nesting){
			query = "( " + subQuery + " ) " + " as rel" + count++;
		}else{
			query = subQuery;
		}
		return query;
	}

	//visitNatural converts natural join expression
	@Override
	public String visitNatural(NaturalContext ctx) {
		// TODO Auto-generated method stub
		boolean nesting = nested;
		String A = visit(ctx.relation(0));
		String B = visit(ctx.relation(1));
		
		String subQuery = A + " NATURAL JOIN " + B ;
		String query;
		if(nesting){
			query = subQuery;
		}else{
			query = "SELECT * FROM " +subQuery;
		}
		System.out.println(query);
		return query;
	}

	//visitCartesian converts cartesian product expression
	@Override
	public String visitCartesian(CartesianContext ctx) {
		// TODO Auto-generated method stub
		boolean nesting = nested;
		ArrayList<String> relations = new ArrayList<String>();
		for(RelationContext r : ctx.relation()){
			relations.add(visit(r));
		}
		String subQuery = relations.get(0) ;
		
		for(int i=1;i<relations.size();++i){
			subQuery += " , " + relations.get(i);
		}
		String query;
		if(nesting){
			query = subQuery;
		}else{
			query = "SELECT * FROM " +subQuery;
		}
		return query;
	}

	//visitSimple passes the name of the relation as relation
	@Override
	public String visitSimple(SimpleContext ctx) {
		// TODO Auto-generated method stub
		return ctx.RELATION().getText();
	}

	// visitNested passes the string obtained after converting
	// the nested expression as relation
	@Override
	public String visitNested(NestedContext ctx) {
		// TODO Auto-generated method stub
		nested = true;
		System.out.println("nesting " + ctx.getText());
		String relation = visit(ctx.expression());
		//relation = "(" + relation + ") as rel" + count++;
		
		nested = false;
		return relation;
	}
}
