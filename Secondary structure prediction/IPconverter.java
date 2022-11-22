import java.io.*;
import java.lang.*;
public class IPconverter{
public static void main(String args[]) throws IOException{


int position;

FileOutputStream out=new FileOutputStream("C:\\mywork\\q.txt");
PrintStream p= new PrintStream(out);


String X="00000";
String A="00001";
String R="00010";
String N="00011";
String D="00100";
String C="00101";
String Q="00110";
String E="00111";
String G="01000";
String H="01001";
String I="01010";
String L="01011";
String K="01100";
String M="01101";
String F="01110";
String P="01111";
String S="10000";
String T="10001";
String W="10010";
String Y="10011";
String V="10100";

String InputDescriptors="000";


int[] hel=new int[]{0,1};
int[] coil=new int[]{0,0};
int[] sheet=new int[]{1,1};
int[] abc=new int[]{1,2};








String a="Y";
String b;
int j,i;



do{
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	System.out.println("Enter the sequence\n");
	String aa="";
	aa=br.readLine();

	System.out.println("Enter the structure\n");
	String str="";
	str=br.readLine();
	
int len1=aa.length();
int len2=str.length();
String[] aaarray;
aaarray = new String[len2];
char[] strarray;
strarray = new char[len2];

System.out.println("length of aa seq is"+len1);
System.out.println("length of aa str is"+len2);






	for(i=0;i<len1-16;i++)
	{
	String seq=aa.substring(i,i+17);
	
	
	aaarray[i]=seq;
System.out.println("aaaray is"+aaarray[i]);
	}






	for(j=0;j<len2;j++)
	{
	char pro=str.charAt(j);
	
	strarray[j]=pro;
System.out.println("straaray is"+strarray[j]);
	
	}


char q;

for(i=0;i<len2;i++)
{

	for(j=0;j<17;j++)
	{

	q=aaarray[i].charAt(j);
               


	if(q=='A')
	{
		InputDescriptors=A;
	}
	if(q=='R')
	{
		InputDescriptors=R;
	}
	if(q=='N')
	{
		
		InputDescriptors=N;
		
	}
	if(q=='D')
	{
		
		InputDescriptors=D;
	}
	if(q=='C')
	{
		
		InputDescriptors=C;
	}
	if(q=='Q')
	{
		
		InputDescriptors=Q;
	}
	if(q=='E')
	{
	
		InputDescriptors=E;
	}
	if(q=='G')
	{
		
		InputDescriptors=G;
	}
	if(q=='H')
	{
	
		InputDescriptors=H;
	
	}
	if(q=='I')
	{
		
		InputDescriptors=I;
	}
	if(q=='L')
	{
	
		InputDescriptors=L;
	}
	if(q=='K')
	{
	
		InputDescriptors=K;
	}
	if(q=='M')
	{
	
		InputDescriptors=M;
	}
	if(q=='F')
	{
	
		InputDescriptors=F;
	
	}
	if(q=='P')
	{
		
		InputDescriptors=P;
		
	}
	if(q=='S')
	{
	
		InputDescriptors=S;
	}
	if(q=='T')
	{
		
		InputDescriptors=T;
		
	}
	if(q=='W')
	{
		
		InputDescriptors=W;
	}
	if(q=='Y')
	{
	
		InputDescriptors=Y;
	}
	if(q=='V')
	{
		InputDescriptors=V;
	}
	if(q=='X')
	{
		InputDescriptors=X;
	}	

	
	System.out.print(InputDescriptors+";");
p.print(InputDescriptors+";");

}
char bb;
 
bb=strarray[i];





		
	if(bb=='C')
	{
	
		abc[0]=0;
		abc[1]=0;
	}
	if(bb=='H')
	{
		abc[0]=0;
		abc[1]=1;
	}
	if(bb=='E')
	{
		abc[0]=1;
		abc[1]=1;
	}	



        System.out.print(abc[0]+";"+abc[1]+"\n");
p.print(abc[0]+";"+abc[1]+"\n");

	
}








System.out.println("Wanna enter another sequence: Y or N");
b=br.readLine();
}while(a.equals(b));

}}

