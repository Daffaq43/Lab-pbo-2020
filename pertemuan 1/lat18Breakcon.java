public class lat18Breakcon
{    
	public static void main(String arg[])  {   
		for (int i=0; i<10; i++)   
		{    
			for (int j=0; j<i+1; j++)    {     
				if(j==5)      
				continue;     
					System.out.print('*');    
				}     
    				System.out.println();   
    	}  
    }  
}

/* program ini mengubah statement break menjadi continue dalam pelaksanaan nya */