import java.util.*;

public class TowerOfHanoi 
{
	//private data types
	private Pokemon[][] list;
	private int[] size = new int[3];
	
	/**
	 * general constructor 
	 */
	public TowerOfHanoi()
	{
		list = new Pokemon[3][3];
		size = new int[3];
		Pokemon p1 = new Pokemon("AAA");
		Pokemon p2 = new Pokemon("BBB");
		Pokemon p3 = new Pokemon("CCC");
		list[0][0] = p3;
		list[1][0] = p2;
		list[2][0] = p1;
		size[0] = 3;
		size[1] = 1;
		size[2] = 1;
		
	}
	
	/**
	 * overloaded constructor 
	 * @param size of each tower
	 * @param pokemon array
	 */
	public TowerOfHanoi(int s, Pokemon[] p)
	{
		size[0] = s;
		size[1] = 1;
		size[2] = 1;
		list = new Pokemon[p.length][3];
		for(int i = p.length - 1, j = 0; i >= 0; i--, j++)
		{
			list[i][0] = p[j];
		}
		displayList2(list);
	}
	
	/**
	 * solve method, recursive
	 * solving method from http://www.javawithus.com/programs/towers-of-hanoi
	 * @param n
	 * @param start
	 * @param auxiliary
	 * @param end
	 */
	public void solve(int n, String start, String auxiliary, String end) 
	{
	       if (n == 1) 
	       {
	    	   System.out.println();
	           if(start == "A" && end == "C")
	           {
	        	   Pokemon temp = list[size[0] - 1][0];
	        	   list[size[2] - 1][2] = temp;
	        	   list[size[0] - 1][0] = null;
		           displayList2(list);
		           size[0] = size[0] - 1;
		           size[2]++; 
	           }
	           else if(start == "A" && end == "B")
	          {
	        	  Pokemon temp = list[size[0] - 1][0];
	        	  list[size[1] - 1][1] = temp;
		          list[size[0] - 1][0] = null;
		          displayList2(list);
		          size[0]--;
		          size[1]++; 
	          }
	           else if(start == "B" && end == "C")
	          {
	        	  Pokemon temp = list[size[1] - 2][1];
	        	  list[size[2] - 1][2] = temp;
		          //list[size[1] - 1][1] = null;
	        	  list[size[1] - 2][1] = null;
		          displayList2(list);
		          size[1]--;
		          size[2]++;	 
	          }
	           else if(start == "B" && end == "A")
	          {
	        	  Pokemon temp = list[size[1] - 2][1];
	        	   list[size[0]][0] = temp;
	        	   list[size[1] - 2][1] = null;
		          displayList2(list);
		          size[1]--;
		          size[0]++;
	          }
	           else if(start == "C" && end == "A")
	          {
	        	  list[size[0]][0] = list[size[2] - 2][2];
	        	  list[size[2] - 2][2] = null;
		          displayList2(list);
		          size[2]--;
		          size[0]++;
	          }
	           else if(start == "C" && end == "B")
	          {
	        	  
	        	  list[size[1] - 1][1] = list[size[2] - 2][2];
	        	  list[size[2] - 2][2] = null;
		          displayList2(list);
		          size[2]--;
		          size[1]++;
	          }
	       } 
	       else 
	       {
	           solve(n - 1, start, end, auxiliary);
	           System.out.println();
	           if(start == "A" && end == "C")
	           {
	        	   list[size[2] - 1][2] = list[size[0] - 1][0];
	        	   list[size[0] - 1][0] = null;
		           displayList2(list);
		           size[0]--;
		           size[2]++; 
	           }
	           if(start == "A" && end == "B")
	          {
	        	  list[size[1] - 1][1] = list[size[0] - 1][0];
		          list[size[0] - 1][0] = null;
		          displayList2(list);
		          size[0]--;
		          size[1]++; 
	          }
	           else if(start == "B" && end == "C")
	          {
	        	  list[size[2] - 1][2] = list[size[1] - 2][1];
	        	  list[size[1] - 2][1] = null;
		          displayList2(list);
		          size[1]--;
		          size[2]++;	 
	          }
	           else if(start == "B" && end == "A")
	          {
	        	  list[size[0]][0] = list[size[1] - 2][1];
	        	  list[size[1] - 2][1] = null;
		          displayList2(list);
		          size[1]--;
		          size[0]++;
	          }
	           else if(start == "C" && end == "A")
	          {
	        	  list[size[0]][0] = list[size[2] - 2][2];
	        	  list[size[2] - 2][2] = null;
		          displayList2(list);
		          size[2]--;
		          size[0]++;
	          }
	           else if(start == "C" && end == "B")
	          {
	        	  list[size[1] - 1][1] = list[size[2] - 2][2];
	        	  list[size[2] - 2][2] = null;
		          displayList2(list);
		          size[2]--;
		          size[1]++;
	          }
	          System.out.println(" ");
	          solve(n - 1, auxiliary, start, end);
	       }
	   }
	 
	/**
	 * display the 2d array to show current positions of pokemon
	 * @param l
	 */
	 public void displayList2(Pokemon[][] l)
	 {
		 System.out.printf("%15s%15s%15s%n", "A  |", "B  |", "C   ");
		 System.out.printf("%45s","____________________________________________");
		 System.out.println();
		 for(int i = l.length - 1; i >= 0; i--)
		   {
		      for(int j = 0; j < 3; j++)
		      {
		         if(l[i][j] != null){
		        	 if(j == 2)
		        		 System.out.printf("%15s", l[i][j] + " "); 
		        	 else
		        		 System.out.printf("%15s", l[i][j] + " |");}
		         else
		        	 if(j == 2)
		        		 System.out.printf("%15s", " ");
		        	 else
		        		 System.out.printf("%15s",  "|");
		      }
		      System.out.println();
		   }
	 }
	 
	 public String getList()
	 {
		 return " " + list[2][2].getName() + list[1][2].getName() + list[0][2].getName() + " ";
	 }

}
