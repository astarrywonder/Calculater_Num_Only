package calc_num;

public class ExpressionNode {
	//variables
		private ExpressionNum node;
		private ExpressionNum childLeft;
		private ExpressionNum childright;
	
	//variables get and set
		public ExpressionNum getnode(){
			return this.node;
		}		
		public void setnode(ExpressionNum input){
			this.node = input;
		}
		
		public ExpressionNum getchildLeft(){
			return this.childLeft;
		}
		public void setchildLeft(ExpressionNum input){
			this.childLeft = input;
		}
		
		public ExpressionNum getchildRight(){
			return this.childright;
		}		
		public void setchildRight(ExpressionNum input){
			this.childright = input;
		}
	
	//constructor
		public ExpressionNode(){
			this.node = new ExpressionNum();
			this.childLeft = null;
			this.childright = null;
		}
		public ExpressionNode(ExpressionNum input){
			this.node = input;
			this.childLeft = null;
			this.childright = null;
		}
		public ExpressionNode(ExpressionNum input1, ExpressionNum input2){
			this.node = input1;
			this.childLeft = input2;
			this.childright = null;
		}
		public ExpressionNode(ExpressionNum input1, ExpressionNum input2, ExpressionNum input3){
			this.node = input1;
			this.childLeft = input2;
			this.childright = input3;
		}
		
	//methods
		private ExpressionNum resolve(){
			//TODO
			return node;
		}
	//methods get and set
		public ExpressionNum doresolve(){
			return resolve();
		}
	
}
