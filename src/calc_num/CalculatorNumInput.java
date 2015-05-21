package calc_num;

public class CalculatorNumInput {
	//variables
		private ExpressionNode rootnode;
	
	//variables get and set
		public ExpressionNode getrootnode(){
			return this.rootnode;
		}
		public void setinputstring(ExpressionNode input){
			this.rootnode = input;
		}
		
	//constructors
		public CalculatorNumInput(){
			this.rootnode = null;
		}
		
		public CalculatorNumInput(ExpressionNode input){
			this.rootnode = input;
		}
		
		public CalculatorNumInput(String input){
			this.rootnode = stringtonode(input);
		}
	
	//methods
		private ExpressionNode stringtonode(String input){
			return stringtonodebase(input);
		}
		
		private ExpressionNode stringtonodebase(String input){
			for(int i = 0; i < input.length(); i++){
				if(isint(input.charAt(i))){
					System.out.print("found an int");
				}
				else{
					System.out.print("no ints");
				}
				
				
				
				
				
			}
			
			
			return null;
		}
		
		private ExpressionNode stringtobaserecursion(){
			return null;
		}
	
		private boolean isint(char input){
			boolean result = false;
			switch(input){
				case '1':
				case '2':
				case '3':
				case '4':
				case '5':
				case '6':
				case '7':
				case '8':
				case '9':
				case '0':
					result = true;
					break;
				default:
					break;
			}
			return result;
		}
		
	//methods get and set
}
