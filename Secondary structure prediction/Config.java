import java.io.*;

class Config{

public static void main(String args[]) throws IOException{


int  noOfNeuron,  noOfNeuronIP,  noOfNeuronHL=0,  noOfNeuronOP, noOfSynapses, i, j;
int flatnessHL=1,  flatnessOP=1;
char axonfamilyHL='t',axonfamilyOP='l' ;   // 't' tanh,'g' logistic, 'l' linear;
double momentumHL, momentumOP;
double learningrateOP,learningrateHL;
String a="Y";
String b;

do{

//double learningrateHL=learningrateOP=0.2;







BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

System.out.println("Enter the momentum\n");
String ts="";
        ts=br.readLine();
  momentumHL=Double.parseDouble(ts);
momentumOP=momentumHL;

System.out.println("Enter the learning rate\n");
String st="";
        st=br.readLine();
  learningrateHL=Double.parseDouble(st);
learningrateOP=learningrateHL;


System.out.println("Enter the file name\n");
String s="";
        s=br.readLine();
  

FileOutputStream out=new FileOutputStream("c:\\mywork\\"+s);
PrintStream p= new PrintStream(out);

noOfNeuronIP=17;
noOfNeuronOP=2;

int z;
		

	System.out.println("Enter your choice for number of neurons in hidden layer\n");
        System.out.println("1. for one neuron\n2. for as many neurons as their are in the input layer\n3. for 3/4th the neurons in input layer\n4. for one more than half in the input layer\n5. for 1/4th the neurons in the input layer\n6. for 2/3rd of sum of neurons in input and output layer\n7. you wanna set the number of neurons in the hidden layer by self");

String str="";
str=br.readLine();
z=Integer.parseInt(str);
switch (z) {
case 1:
  noOfNeuronHL=1;
  break;
case 2:
  noOfNeuronHL=noOfNeuronIP; 
  break;
case 3:
   noOfNeuronHL=noOfNeuronIP*3/4;
   break;
case 4:
   noOfNeuronHL=(noOfNeuronIP/2)+1;
   break;
case 5:
   noOfNeuronHL=noOfNeuronIP/4; 
   break;  
case 6:
   noOfNeuronHL=( noOfNeuronIP+noOfNeuronOP)*2/3;
   break;
case 7:
   str=br.readLine();
   noOfNeuronHL=Integer.parseInt(str);
   break;
default:
  System.out.println("The choice you entered is not good\n");
  break;
}

	System.out.println("no. of neurons in hidden layer is =" +noOfNeuronHL);
        
	
	noOfNeuron= noOfNeuronIP+noOfNeuronHL+noOfNeuronOP;

	System.out.print("#neurons;"+ noOfNeuron+"\n");
	p.println("#neurons;"+ noOfNeuron);

		for(i=0;i<noOfNeuronIP;i++)
		{	
		System.out.println("i;"+i+";0");
		p.println("i;"+i+";0");
		}
                                 
                               

		for(j=0;j< noOfNeuronHL;j++)
		{
		System.out.println("n;"+i+";1;"+flatnessHL+";"+axonfamilyHL+";"+momentumHL+";"+learningrateHL);
		p.println("n;"+i+";1;"+flatnessHL+";"+axonfamilyHL+";"+momentumHL+";"+learningrateHL);
		i++;
		}
		

		for(j=0;j<noOfNeuronOP;j++)
		{
		System.out.println("n;"+i+";2;"+flatnessOP+";"+axonfamilyOP+";"+momentumOP+";"+learningrateOP);
		p.println("n;"+i+";2;"+flatnessOP+";"+axonfamilyOP+";"+momentumOP+";"+learningrateOP);
		i++;
		}


	noOfSynapses=(noOfNeuronIP*noOfNeuronHL)+(noOfNeuronHL*noOfNeuronOP);
	System.out.println("#synapses;"+noOfSynapses);
	p.println("#synapses;"+noOfSynapses);
                int k=0;
                	
		for(i=0;i<noOfNeuronIP;i++)
		{
 		for(j=(noOfNeuronIP);j<(noOfNeuronIP+noOfNeuronHL);j++)
		{
  		System.out.println("s;"+k+";"+i+";"+j);
		p.println("s;"+k+";"+i+";"+j);
  		k++;
  		}
		}

int y;
for(y=2;y>=1;y--)
{

              		for(i=noOfNeuronIP;i< (noOfNeuron-y);i++)
		{
if(i<21)
{
               		System.out.println("s;"+k+";"+i+";"+(noOfNeuron-y));
		p.println("s;"+k+";"+i+";"+(noOfNeuron-y));
              		 k++;
}

		}


}

out.close();
System.out.println("Wanna enter another file name: Y or N");
b=br.readLine();
}while(a.equals(b));
}
}
