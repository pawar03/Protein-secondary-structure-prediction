import java.io.*;
import java.lang.*;
import java.util.Scanner;

class PredictStructure
{
   public static void main(String args[]) throws IOException
   {
//recreate the net

Randomizer randomizer= new Randomizer();
System.out.println("Recreating the net");
NeuralNet mynet=new NeuralNet("h5m8l9.nnc", randomizer);
mynet.LoadWeights("ert.nnw");
System.out.println("Weight file loaded");

//and test it

FileOutputStream out=new FileOutputStream("C:\\pooja\\mywork\\ann\\ip.txt");
PrintStream p= new PrintStream(out);

double X=00000;
double A=0.40;
double R=0.95;
double N=0.70;
double D=0.75;
double C=0.50;
double Q=0.85;
double E=0.80;
double G=0.65;
double H=0.99;
double I=0.25;
double L=0.20;
double K=0.90;
double M=0.30;
double F=0.15;
double P=0.45;
double S=0.55;
double T=0.60;
double W=0.05;
double Y=0.10;
double V=0.35;

double InputDescriptors=000;

String a="Y";
String b="N";
int i=0;
int j=0;
int k=0;

do{	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	System.out.println("Enter the sequence\n");
	String aa="";
	aa=br.readLine();

int len1=aa.length();
String[] aaarray;
aaarray = new String[len1];
System.out.println("length of aa seq is"+len1);

	for(i=0;i<len1-16;i++)
	{
	String seq=aa.substring(i,i+17)
	aaarray[i]=seq;
            System.out.println("aaaray is"+aaarray[i]);
	}


double[] iparray;
iparray = new double[17];
char q;
double[] op;
op=new double[len1-16];

for(i=0;i<len1-16;i++)
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

iparray[j]=InputDescriptors;
System.out.print(iparray[j]+";");
}
double[] outputs=mynet.Output(iparray);
System.out.println(outputs[0]);

op[i]=outputs[0];

	System.out.println();
	
}

System.out.println("OUTPUT IS");

	for(i=0;i<len1-16;i++)
	{
	if (op[i]>0.0 && op[i]<0.50)
	{
	op[i]= 0.15;
	}
	if (op[i]>0.50 && op[i]<0.55)
	{
	op[i]= 0.50;
	}
	if (op[i]>0.55 && op[i]<0.99)
	{
	op[i]= 0.85;
	}
	System.out.println(op[i]+";");
	p.println(op[i]+";");

	}
System.out.println("Wanna enter another sequence: Y or N");
b=br.readLine();

}while(a.equals(b));
}
}

