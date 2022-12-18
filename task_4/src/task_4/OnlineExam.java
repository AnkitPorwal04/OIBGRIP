package task_4;
import java.util.*;

public class OnlineExam {
	public static void main(String[] args) {
        int ch=4;
        int choice;
        String name;
		@SuppressWarnings("unused")
		int id=0;
        @SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);

        System.out.print("Enter user name:");
        name=sc.next();
        System.out.print("Enter roll no:");
        id=sc.nextInt();
        int count=0;
        System.out.println("Welcome "+name+" to Online Examination");

        do
        {


            System.out.println("1.Take Exam");
            System.out.println("2.View Marks");
            System.out.println("3.Exit");
            System.out.print("Enter your choice:");
            ch=sc.nextInt();
            if(ch==4)
            {
                System.out.println("Thank you for taking exam");
                break;
            }
            switch(ch)
            {
                case 1:
                {
                    System.out.println("Select programming language:");
                    System.out.println("1.C \n2.C++ \n3.Java");
                    System.out.println("Enter your choice:");
                    int sub=sc.nextInt();
                    System.out.println("There are 5 questions in the examination");


                    System.out.println("Each question consist of 4 option you have to choose correct answer");
                    if(sub==2)
                    {
                        count=0;
                        System.out.println("Q.1.Who invented C++?:");

                        System.out.println("1.Dennis Ritchie \n2.James Gosling\n3. Bjarne Stroustrup\n4.Ken Thompson");
                        System.out.print("Enter answer:");
                        choice=sc.nextInt();
                        if(choice==3)
                        {
                            ++count;
                        }
                        System.out.println("Q.2.What is C++ ?");
                        System.out.println("1.C++ is an object oriented programming language\n2.C++ is a procedural programming language\n3.C++ supports both procedural and object oriented programming language\n4. C++ is a functional programming language");
                        System.out.print("Enter answer:");
                        choice=sc.nextInt();
                        if(choice==3)
                        {
                            ++count;
                        }
                        System.out.println("Q.3.Which of the following is the correct syntax of including a user defined header files in C++ ?");
                        System.out.println("1.#include [userdefined]\n2.#include “userdefined\n3.#include <userdefined.h>\n4.#include <userdefined>");
                        System.out.print("Enter answer:");
                        choice=sc.nextInt();
                        if(choice==2)
                        {
                            ++count;
                        }
                        System.out.println("Q.4.Which of the following user-defined header file extension used in c++ ?");
                        System.out.println("1.hg\n2.cpp\n3.h\n4.hf");
                        System.out.print("Enter answer:");
                        choice=sc.nextInt();
                        if(choice==3)
                        {
                            ++count;
                        }
                        System.out.println("Q.5.Which of the following is a correct identifier in C++?");
                        System.out.println("1.VAR_1234\n2. $var_name\n3.7VARNAME\n4.7var_name");
                        System.out.print("Enter answer:");
                        choice=sc.nextInt();

                        if(choice==1)
                        {
                            ++count;
                        }
                    }
                    else if(sub==1)
                    {
                        count=0;
                        System.out.println("Q.1.Who is the father of C language?");

                        System.out.println("1.Bjarne Strousrup\n2.Dennis Ritchie\n3.Steve Jobs\n4.Ken Thompson");
                        System.out.print("Enter answer:");
                        choice=sc.nextInt();
                        if(choice==2)
                        {
                            ++count;
                        }
                        System.out.println("Q.2.Which of the following is not a valid C variable name?");
                        System.out.println("1.int number;\n2.float rate;\n3.int variable_count;\n4.int $main;");
                        System.out.print("Enter answer:");
                        choice=sc.nextInt();
                        if(choice==4)
                        {
                            ++count;
                        }
                        System.out.println("Q.3.All keywords in C are in");
                        System.out.println("1.LowerCase letters\n2.UpperCase letters\n3.CamelCase letters\n4.None of above");
                        System.out.print("Enter answer:");
                        choice=sc.nextInt();
                        if(choice==1)
                        {
                            ++count;
                        }
                        System.out.println("Q.4. C is:");
                        System.out.println("1.Procedure Oriented\n2.Object Oriented\n3.Strictly Object Orieneted\n4.None");
                        System.out.print("Enter answer:");
                        choice=sc.nextInt();
                        if(choice==1)
                        {
                            ++count;
                        }
                        System.out.println("Q.5.Which is valid C expression?");
                        System.out.println("1.int my_num = 100,000;\n2.int my_num = 100000;\n3.int my num = 1000;\n4.None of these");
                        System.out.print("Enter answer:");
                        choice=sc.nextInt();
                        if(choice==2)
                        {
                            ++count;
                        }
                    }
                    else
                    {
                        count=0;
                        System.out.println("Q.1.Who invented Java Programming?");

                        System.out.println("1.Steve Jobs\n2.Dennis Ritchie\n3. James Gosling\n4.Ken Thompson");
                        System.out.print("Enter answer:");
                        choice=sc.nextInt();
                        if(choice==3)
                        {
                            ++count;
                        }
                        System.out.println("Q.2.Which statement is true about Java?");
                        System.out.println("1.Java is a sequence-dependent programming language\n2. Java is a code dependent programming language\n3.Java is a platform-dependent programming language\n4.Java is a platform-independent programming language");
                        System.out.print("Enter answer:");
                        choice=sc.nextInt();
                        if(choice==4)
                        {
                            ++count;
                        }
                        System.out.println("Q.3.Which component is used to compile, debug and execute the java programs?");
                        System.out.println("1.JRE\n2.JDK\n3.JIT\n4.JVM");
                        System.out.print("Enter answer:");
                        choice=sc.nextInt();
                        if(choice==2)
                        {
                            ++count;
                        }
                        System.out.println("Q.4.Which one of the following is not a Java feature?");
                        System.out.println("1.Object Oriented\n2.Use of Pointer\n3.Portable\n4.Dynamic and Extensible");
                        System.out.print("Enter answer:");
                        choice=sc.nextInt();
                        if(choice==2)
                        {
                            ++count;
                        }
                        System.out.println("Q.5.Dynamic and Extensible");
                        System.out.println("1. .js\n2. .txt\n3. .class\n4. .java");
                        System.out.print("Enter answer:");
                        choice=sc.nextInt();
                        if(choice==4)
                        {
                            ++count;
                        }
                    }


                    break;
                }
                case 2:
                    System.out.println("Congratulations  "+name+"  You scored "+count+" marks"+"out of 5");
                case 3:
                	System.exit(0);

            }


        }while(true);
    }
}