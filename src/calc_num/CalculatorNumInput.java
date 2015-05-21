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
			if(input.length() == 0){
				return new ExpressionNode();
			}
			else{
				stringtobaserecursion(0, input.length());
			}
			
			
			

		    //exponents and roots
			
			
		    //multiplication and division
			
			
		    //addition and subtraction 
			
			
			
//			for(int i = 0; i < input.length(); i++){
//				
//			}
			
			
			return null;
		}
		
		private ExpressionNode stringtobaserecursion(int start, int end){
			
			return null;
		}
		
		private boolean isint(char input){
			boolean result = false;
			switch(input){
				case '1':
					result = true;
					break;
				case '2':
					result = true;
					break;
				case '3':
					result = true;
					break;
				case '4':
					result = true;
					break;
				case '5':
					result = true;
					break;
				case '6':
					result = true;
					break;
				case '7':
					result = true;
					break;
				case '8':
					result = true;
					break;
				case '9':
					result = true;
					break;
				case '0':
					result = true;
					break;
				default:
					break;
			}
			return result;
		}
		
		private boolean isint(String input, int index){
			boolean result = false;

			if(isint(input.charAt(index))){
				result = true;
			}
			else{
				result = false;
			}
			return result;
		}

		private boolean isvalidexpression(String input){
			boolean result = false;
			if(isvalidexpressionsym(input) && isvalidexpressionstructure(input)){
				result = true;
			}
			else{
				result = false;
			}
			
			
			
			return result;
		}
		
		private boolean isvalidexpressionsym(String input) {
			boolean result = false;

			
			
			
			return result;
		}
		
		private boolean isvalidexpressionstructure(String input) {
			boolean result = false;

			
			
			
			return result;
		}
		
		//methods get and set
		public boolean doisvalidexpression(String input){
			return isvalidexpression(input);
		}
		
}
