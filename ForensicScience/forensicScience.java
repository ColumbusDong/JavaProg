/*
Programmer: Columbus Dong
Date: March 2, 2-15
Assignment: Forensic Science
*/

/*Java Utilities*/
import java.io.*;
import java.util.*;
import java.text.DecimalFormat;


public class forensicScience
{
    public static void main(String args[])
    {
        /*Scanner from File Stuff*/
        Scanner inFile = null; 
        
        DecimalFormat form = new DecimalFormat("##.000");

        try 
            {
            // Create a scanner to read the file, file name is parameter
                inFile = new Scanner (new File("Forensic.txt"));
            } 
        catch (FileNotFoundException e) 
            {
            System.out.println ("File not found!");
            /*Stop Program if no file s found*/
            System.exit(0);
            }

        /*Variables*/
        String line, sex, bone;
        int age;
        double length, height;

        /*Header*/
        System.out.println("Sex\tBone\tAge\tLength\tHeight");
        while (inFile.hasNext())
        {
        	line = inFile.nextLine();

        	/*Turn Sentence Into Array*/
        	final String parts[] = line.split(" ");

        	sex = parts[0];
        	bone = parts[1];
        	age = Integer.parseInt(parts[2]);
        	length = Double.parseDouble(parts[3]);

        	if (sex.equals("M"))
        	{
        		switch (bone)
        		{
        			case "F":
        				height = maleF(age, length);
        				break;

        			case "T":
        				height = maleT(age, length);
        				break;

        			case "H":
        				height = maleH(age, length);
        				break;

        			case "R":
        				height = maleR(age, length);
        				break;

        			default:
        				height = 0;
        				break;
        		}
        	}
        	else if (sex.equals("F"))
        	{
        		switch (bone)
        		{
        			case "F":
        				height = femaleF(age, length);
        				break;

        			case "T":
        				height = femaleT(age, length);
        				break;

        			case "H":
        				height = femaleH(age, length);
        				break;

        			case "R":
        				height = femaleR(age, length);
        				break;

        			default:
        				height = 0;
        				break;
        		}
        	}
        	else
        	{
        		height = -1;
        	}

        	String output = "" + sex + "\t" + bone + "\t" + age + "\t" + length;

        	if (height == 0 | height == -1)
        	{
        		if (height == 0)
        		{
        			output += "\tWrong Bone Code";
        		} 
        		else
        		{
        			output += "\tWrong Sex Code";
        		}
        	} 
        	else
        	{
        		output += "\t" + form.format(height);
        	}
        	
        	System.out.println(output);
        }
    }

    /*Male Femur*/
    public static double maleF(int age, double length)
    {
    	double height = 69.089 + (2.238*length);

    	if (age > 30)
    	{
    		height = height - (.06 * (age - 30));
    	}

    	return height;
    }

    /*Male Tibia*/
    public static double maleT(int age, double length)
    {
    	double height = 81.688 + (2.392*length);

    	if (age > 30)
    	{
    		height = height - (.06 * (age - 30));
    	}

    	return height;
    }

    /*Male Humerus*/
    public static double maleH(int age, double length)
    {
    	double height = 73.570 + (2.970*length);

    	if (age > 30)
    	{
    		height = height - (.06 * (age - 30));
    	}

    	return height;
    }

    /*Male Radius*/
    public static double maleR(int age, double length)
    {
    	double height = 80.405 + (3.650*length);

    	if (age > 30)
    	{
    		height = height - (.06 * (age - 30));
    	}

    	return height;
    }

    /*Female Femur*/
    public static double femaleF(int age, double length)
    {
    	double height = 61.412 + (2.317*length);

    	if (age > 30)
    	{
    		height = height - (.06 * (age - 30));
    	}

    	return height;
    }

    /*Female Tibia*/
    public static double femaleT(int age, double length)
    {
    	double height = 72.572 + (2.533*length);

    	if (age > 30)
    	{
    		height = height - (.06 * (age - 30));
    	}

    	return height;
    }

    /*Female Humerus*/
    public static double femaleH(int age, double length)
    {
    	double height = 64.977 + (3.144*length);

    	if (age > 30)
    	{
    		height = height - (.06 * (age - 30));
    	}

    	return height;
    }

    /*Female Radius*/
    public static double femaleR(int age, double length)
    {
    	double height = 73.502 + (3.876*length);

    	if (age > 30)
    	{
    		height = height - (.06 * (age - 30));
    	}

    	return height;
    }
}

/*Output
Sex	Bone	Age	Length	Height
F	H	45	36.266	178.097
M	F	18	46.967	174.201
M	H	29	33.309	172.498
M	T	95	36.983	166.251
M	R	30	23.1768	165.000
F	F	31	42.55	159.940
F	F	65	39.96	151.899
F	T	50	30.962	149.799
F	R	80	19.375	145.599
M	H	36	24.017	144.540
Q	F	40	30.0	Wrong Sex Code
M	Q	40	30.0	Wrong Bone Code
 */
