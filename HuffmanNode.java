   public class HuffmanNode
   {
      //SymbolNode sNode;
      String symbol;
		double probability;
      String code;
      int codeLength;
      HuffmanNode left;
      HuffmanNode right;
   
      // HuffmanNode(SymbolNode sN, HuffmanNode lt,  HuffmanNode rt)
      HuffmanNode(String s, double p, HuffmanNode lt,  HuffmanNode rt)
      {
         //sNode = sN;
         symbol = s;
         probability = p;
         left = lt;
         right = rt; 
      }
   
      HuffmanNode()
      {
      }
            
      void setCode(String c)
      {
         code = c;
         codeLength = c.length();
      }
      
      void setProbability(double p)
      {
         probability = p;
      }
      
      String getSymbol()
      {
         return symbol;
      } 
       
      double getProbability()
      {
         return probability;
      }  
      
      String getCode()
      {
         return code;
      }  
      
      int getCodeLength()
      {
         return codeLength;
      }  
 
   }
