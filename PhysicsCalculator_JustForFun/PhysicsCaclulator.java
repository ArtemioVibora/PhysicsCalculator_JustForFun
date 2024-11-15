import java.io.*;

/*This is my attempt in making a calculator for Physics.
And this is for me to practice Java at the same time prepare myself
for Physics*/

/* First goal is to build a motion calculator NEWTONIAN*/

class PhysicsCalculator
{
  //Placed it here so that it could be accessible to all methods
  public static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
  
  //Created an Add method taking x + y
  public static double Add(double num1, double num2)
  {
    double sum = num1 + num2;
    return sum;
  }
  
  //Created a Sub method taking x - y
  public static double Sub(double num1, double num2)
  {
    double diff = num1 - num2;
    return diff;
  }
  
  //Created a Multi method taking x * y
  public static double Multi(double num1, double num2)
  {
    double prod = num1 * num2;
    return prod;
  }
  
  //Created a Div method taking x / y
  public static double Div(double num1, double num2)
  {
    double quot = num1 / num2;
    return quot;
  }
  
  //Calculates the powers
  public static double Powers(double num, double powers)
  {
    double result = 0;
      if (powers == 0)
      {
        result = 1;
        return result;
      }
      else
      {
        return num * Powers(num, powers - 1);
      }
  }
  
  /*TO DO: MAKE A CONVERSION TABLE
  Grams to Kilograms are done*/
  public static void GToKG()
  {
    double gram = 0;
    double kg = 0;
    while (true)
    {
      try
      {
        System.out.print("Enter gram/s: ");
        gram = Double.parseDouble(reader.readLine());
        if (gram <= 0)
        {
          System.out.println("ERROR: INVALID INPUT!");
          continue;
        }
        
      }
      catch (Exception e)
      {
        System.out.println("ERROR: INVALID INPUT!");
        continue;
      }
      break;
    }
    kg = gram / 1000;
    System.out.println(kg + "kg");
  }
  
  //SI TABLE... maybe this is the conversion table
  public static void SITable()
  {
    System.out.println();
    System.out.println("============= SI Conversion Table ===============");
    System.out.println("|---------------|----------------|--------------|");
    System.out.println("|Prefix: Yotta  |Abbrv:    Y     |Value:  10^24 |");
    System.out.println("|---------------|----------------|--------------|");
    System.out.println("|Prefix: Zetta  |Abbrv:    Z     |Value:  10^21 |");
    System.out.println("|---------------|----------------|--------------|");
    System.out.println("|Prefix: Exa    |Abbrv:    E     |Value:  10^18 |");
    System.out.println("|---------------|----------------|--------------|");
    System.out.println("|Prefix: Peta   |Abbrv:    P     |Value:  10^15 |");
    System.out.println("|---------------|----------------|--------------|");
    System.out.println("|Prefix: Tera   |Abbrv:    T     |Value:  10^12 |");
    System.out.println("|---------------|----------------|--------------|");
    System.out.println("|Prefix: Giga   |Abbrv:    G     |Value:  10^9  |");
    System.out.println("|---------------|----------------|--------------|");
    System.out.println("|Prefix: Mega   |Abbrv:    M     |Value:  10^6  |");
    System.out.println("|---------------|----------------|--------------|");
    System.out.println("|Prefix: Kilo   |Abbrv:    k     |Value:  10^3  |");
    System.out.println("|---------------|----------------|--------------|");
    System.out.println("|Prefix: Hecto  |Abbrv:    h     |Value:  10^2  |");
    System.out.println("|---------------|----------------|--------------|");
    System.out.println("|Prefix: deka   |Abbrv:    da    |Value:  10^1  |");
    System.out.println("|---------------|----------------|--------------|");
    System.out.println("|Prefix: deci   |Abbrv:    d     |Value:  10^-1 |"); 
    System.out.println("|---------------|----------------|--------------|");
    System.out.println("|Prefix: Centi  |Abbrv:    c     |Value:  10^-2 |");
    System.out.println("|---------------|----------------|--------------|");
    System.out.println("|Prefix: Milli  |Abbrv:    m     |Value:  10^-3 |");
    System.out.println("|---------------|----------------|--------------|");
    System.out.println("|Prefix: Micro  |Abbrv: greek(m) |Value:  10^-6 |");
    System.out.println("|---------------|----------------|--------------|");
    System.out.println("|Prefix: Nano   |Abbrv:    n     |Value:  10^-9 |");
    System.out.println("|---------------|----------------|--------------|");
    System.out.println("|Prefix: Pico   |Abbrv:    p     |Value: 10^-12 |");
    System.out.println("|---------------|----------------|--------------|");
    System.out.println("|Prefix: Femto  |Abbrv:    f     |Value: 10^-15 |");
    System.out.println("|---------------|----------------|--------------|");
    System.out.println("|Prefix: Atto   |Abbrv:    a     |Value: 10^-18 |");
    System.out.println("|---------------|----------------|--------------|");
    System.out.println("|Prefix: Zepto  |Abbrv:    z     |Value: 10^-21 |");
    System.out.println("|---------------|----------------|--------------|");
    System.out.println("|Prefix: Yocto  |Abbrv:    y     |Value: 10^-24 |");
    System.out.println("|---------------|----------------|--------------|");
    System.out.println();
    
  }
  
  public static void ConversionTableTIME()
  {
    String input;
    double sec;
    double hour;
    double min;
    double day;
    System.out.println("============= Time Convert Table ================");
    System.out.println("Type --help for help");
    System.out.println();
    
    while(true)
    {
      try
      {
        System.out.print("Enter a measurement for time: ");
        input = reader.readLine();
        switch (input)
        {
          case "--help":
            System.out.println("=================================================");
            System.out.println("Type seconds                 to calculate seconds");
            System.out.println("Type minutes                 to calculate minutes"); 
            System.out.println("Type hours                     to calculate hours");
            System.out.println("Type days                       to calculate days");
            System.out.println("Type leave                               to leave");
            System.out.println("=================================================");
            System.out.println();
            continue;
          case "seconds":
            System.out.print("Enter second/s: ");
            sec = Double.parseDouble(reader.readLine());
            min = sec / 60;
            hour = sec / 3600;
            day = sec / 86400;
            System.out.println("| " + sec + " second/s| " + min + " minute/s| " + hour + " hour/s| " + day + " day/s |");
            continue;
          case "minutes":
            System.out.print("Enter munite/s: ");
            min = Double.parseDouble(reader.readLine());
            sec = min * 60;
            hour = min / 60;
            day = min / 1440;
            System.out.println("| " + sec + " second/s | " + min + " minute/s | " + hour + " hour/s | " + day + " day/s |");
            continue;
          case "hours":
            System.out.print("Enter hour/s: ");
            hour = Double.parseDouble(reader.readLine());
            sec = hour * 3600;
            min = hour * 60;
            day = hour / 24;
            System.out.println("| " + sec + " second/s | " + min + " minute/s | " + hour + " hour/s | " + day + " day/s |");
            continue;
          case "days":
            System.out.print("Enter day/s: ");
            day = Double.parseDouble(reader.readLine());
            sec = day * 86400;
            min = day * 1440;
            hour = day * 24;
            System.out.println("| " + sec + " second/s | " + min + " minute/s | " + hour + " hour/s | " + day + " day/s |");
            continue;
          case "leave":
            break;
          default:
            System.out.println("ERROR: INVALID INPUT!");
            continue;
        }
        
      }
      catch (Exception e)
      {
        System.out.println("ERROR: INVALID INPUT!");
        continue;
      }
      break;
    }
  }
  
  //Simple Calculator performing basic operations
  public static void Calculator()
  {
    String input = "";
    double num1 = 0;
    double num2 = 0;
    double result = 0;
    //boolean flag = true;
    System.out.println("============== SIMPLE CALCULATOR ================");
    System.out.println("type --help for help in Simple Calculator");
    System.out.println();
    
    while (true)
    {
      
      try
      {
        System.out.print("Enter operation: ");
        input = reader.readLine();
        switch(input)
        {
          case "--help":
            System.out.println("Type Addition for Addition");
            System.out.println("Type Subtraction for Subtraction");
            System.out.println("Type Multiplication for Multiplication");
            System.out.println("Type Division for Division");
            System.out.println("Type Powers for powers of a number");
            System.out.println("Type Exit for you to exit");
            continue; 
          case "Addition":
            while(true)
            {
              try
              {
                System.out.print("Enter first number: ");
                num1 = Double.parseDouble(reader.readLine());
              }
              catch(Exception e)
              {
                System.out.println("ERROR: NUMBERS ONLY!");
                continue;
              }
              break;
            }
            while (true)
            {
              try
              {
                System.out.print("Enter second number: ");
                num2 = Double.parseDouble(reader.readLine());
              }
              catch (Exception e)
              {
                System.out.println("ERROR: NUMBERS ONLY!");
                continue;
              }
              break;
            }
            result = Add(num1, num2);
            System.out.println(num1 + " + " + num2 + " = " + result);
            break;
            
          case "Subtraction":
            while(true)
            {
              try
              {
                System.out.print("Enter first number: ");
                num1 = Double.parseDouble(reader.readLine());
              }
              catch(Exception e)
              {
                System.out.println("ERROR: NUMBERS ONLY!");
                continue;
              }
              break;
            }
            while (true)
            {
              try
              {
                System.out.print("Enter second number: ");
                num2 = Double.parseDouble(reader.readLine());
              }
              catch (Exception e)
              {
                System.out.println("ERROR: NUMBERS ONLY!");
                continue;
              }
              break;
            }
            result = Sub(num1, num2);
            System.out.println(num1 + " - " + num2 + " = " + result);
            break;
          
          case "Multiplication":
            while(true)
            {
              try
              {
                System.out.print("Enter first number: ");
                num1 = Double.parseDouble(reader.readLine());
              }
              catch(Exception e)
              {
                System.out.println("ERROR: NUMBERS ONLY!");
                continue;
              }
              break;
            }
            while (true)
            {
              try
              {
                System.out.print("Enter second number: ");
                num2 = Double.parseDouble(reader.readLine());
              }
              catch (Exception e)
              {
                System.out.println("ERROR: NUMBERS ONLY!");
                continue;
              }
              break;
            }
            result = Multi(num1, num2);
            System.out.println(num1 + " * " + num2 + " = " + result);
            break;
          case "Division":
            while(true)
            {
              try
              {
                System.out.print("Enter first number: ");
                num1 = Double.parseDouble(reader.readLine());
              }
              catch(Exception e)
              {
                System.out.println("ERROR: NUMBERS ONLY!");
                continue;
              }
              break;
            }
            while (true)
            {
              try
              {
                System.out.print("Enter second number: ");
                num2 = Double.parseDouble(reader.readLine());
                if (num2 == 0)
                {
                  System.out.println("ERROR: CANNOT DIVIDE BY ZERO");
                  continue;
                }
                else
                {
                  result = Div(num1, num2);
                  System.out.println(num1 + " / " + num2 + " = " + result);
                  break; 
              
                }
              }
              catch (Exception e)
              {
                System.out.println("ERROR: NUMBERS ONLY!");
                continue;
              }
            }
          case "Powers":
            while(true)
            {
              try
              {
                System.out.print("Enter number: ");
                num1 = Double.parseDouble(reader.readLine());
              }
              catch(Exception e)
              {
                System.out.println("ERROR: NUMBERS ONLY!");
                continue;
              }
              break;
            }
            while (true)
            {
              try
              {
                System.out.print("Enter exponent: ");
                num2 = Double.parseDouble(reader.readLine());
              }
              catch (Exception e)
              {
                System.out.println("ERROR: NUMBERS ONLY!");
                continue;
              }
              break;
            }
            result = Powers(num1, num2);
            System.out.println(num1 + " ^ " + num2 + " = " + result);
            break;
          
          //Exits the calculator
          case "Exit":
            //System.out.println("Exiting... ");
            break;
          default:
            System.out.println("ERROR: INVALID INPUT!");
            continue;
        }
        break;
      }
      catch (Exception e)
      {
        System.out.println("ERROR: INVALID INPUT!");
      }
    }
  }
  
  /*
  
  This is where the simple calculations will be complicated
  TO DO: refractor it
  
  */
  //Acceleration Calculator a = f/m.
  public static void AccelCal1D()
  {
    double accel = 0;
    double force = 0;
    double mass = 0;//kg
    String input;
    
    System.out.println("Acceleration = Force (N) / Mass (Kg)");
    System.out.println("Note that you need to convert grams to Kg in order for this to work");
    while(true)
    {
      try
      {
        System.out.print("Enter Force (N): ");
        force = Double.parseDouble(reader.readLine());
        if (force <= 0)
        {
        
          System.out.println("ERROR: INVALID INPUT!");
          continue;
        }
      }
      catch(Exception e)
      {
        System.out.println("ERROR: INVALID INPUT!");
        continue;
      }
      break;
    }
    while(true)
    {
      try
      {
        System.out.print("Enter mass (Kg): ");
        mass = Double.parseDouble(reader.readLine());
        if (mass <= 0)
        {
          System.out.println("ERROR: INVALID INPUT!");
          continue;
        }
        break;
      }
      catch(Exception e)
      {
        System.out.println("ERROR: INVALID INPUT!");
        continue;
      }
    }
    accel = force / mass;
    System.out.println(accel + "m/s");
  }
  
  public static void AverageSpeed()
  {
    double aveA = 0;
    double v1 = 0;
    double v2 = 0;
    double t1 = 0;
    double t2 = 0;
    String input;
  
    System.out.println("================ Average Speed =================");
    System.out.println();
    System.out.println("a (average acceleration) = v2 - v1 / t2 - t1");
    System.out.println("Acceleration is defined as the change of velocity");
    System.out.println("divided by time taken to make this change");
    System.out.println();
    System.out.println("Before we begin, we must specify the units");
    System.out.println("The unit specified here is km/h and seconds");
    /*
    
    TO DO CONVERT UNITS OF MEASUREMENT INTO STANDARD, t should be in seconds, and velocity should be km/h
    
    */
    
    while(true)
    {
      try
      {
        System.out.print("Enter v2: ");
        v2 = Double.parseDouble(reader.readLine());
        break;
      }
      catch(Exception e)
      {
        System.out.println("ERROR: INVALID INPUT!");
        continue;
      }
      
    }
    while(true)
    {
      try
      {
        System.out.print("Enter v1: ");
        v1 = Double.parseDouble(reader.readLine());
        break;
      }
      catch(Exception e)
      {
        System.out.println("ERROR: INVALID INPUT!");
        continue;
      }
      
    }
    while(true)
    {
      try
      {
        System.out.print("Enter t2: ");
        t2 = Double.parseDouble(reader.readLine());
        break;
      }
      catch(Exception e)
      {
        System.out.println("ERROR: INVALID INPUT!");
        continue;
      }
      
    }
    while(true)
    {
      try
      {
        System.out.print("Enter t1: ");
        t1 = Double.parseDouble(reader.readLine());
        break;
      }
      catch(Exception e)
      {
        System.out.println("ERROR: INVALID INPUT!");
        continue;
      }
      
    }
    aveA = (v2 - v1) / (t2 - t1);
    System.out.println();
    System.out.println(v2 + "km/h" + " - " + v1 + "km/h");
    System.out.println("-------------------");
    System.out.println(t2 + "s - " + t1 + "s");
    System.out.println(" = " + aveA + "m/s^2");
    System.out.println();
  }
  
  //This method displays about
  public static void AboutTheSoftware()
  {
   System.out.println("============ The Physics Calculator =============");
   System.out.println();
   System.out.println("It is developed by Juan Cleto of Iacademy");
   System.out.println("A small passion project to combine both physics");
   System.out.println("and Computer Science");
   System.out.println();
  }
  
  //Help program
  public static void Help()
  {
    System.out.println();
    System.out.println("COMMANDS");
    System.out.println("================================================");
    System.out.println("Terminate program              Exits the program");
    System.out.println("--about                       About the Software");
    System.out.println("clear                              clears screen");
    System.out.println("Acceleration 1D      Enters Acceleration program");
    System.out.println("Simple calculator       Enters simple calculator");
    System.out.println("G2KG                        Converts Grams to KG");
    System.out.println("--whiteboard                   Enters Whiteboard");
    System.out.println("SITable                          Access SI Table");
    System.out.println("Average speed               Average acceleration");
    System.out.println("Time convert        To access conversion of time");
    System.out.println("================================================");
    System.out.println();
  }
  
  //Miscelleneous
  /*Displays a 'white board' where people 
  could write stuff on it*/
  public static void WhiteBoard()
  {
    String implementation = "";
    //For Later
    String input = "";
    
    while (true)
    {
      System.out.print("$~");
      try
      {
        input = reader.readLine();
        //Double.parseDouble(input);
        switch (input)
        {
          case "print@":
            System.out.print("$~");
            implementation = reader.readLine();
            System.out.print("$~" + implementation);
            System.out.println();
            continue;
          
          case "leave@":
            break;
            
          default:
            System.out.println("ERROR: INVALID INPUT >>> CANNOT UNDERSTAND COMMAND");
            continue;
            
        }
        break; 
      }
      catch(Exception e)
      {
        System.out.println("ERROR: INVALID INPUT!");
        continue;
      }
    }
  }
  
  //RunProgram, this will serve as the options menu
  public static void RunProgram()
  {
    String input;
    
    
    while(true)
    {
      try
      {
        System.out.print("Enter command: ");
        input = reader.readLine();
        System.out.println();
        switch(input)
        {
          case "Simple calculator":
            Calculator();
            continue;
          case "G2KG":
            GToKG();
            continue;
            
          case "Acceleration 1D":
            AccelCal1D();
            continue;
          case "Terminate program":
            break;
          case "--help":
            Help();
            continue;
          case "--about":
            AboutTheSoftware();
            continue;
          case "--whiteboard":
            WhiteBoard();
            continue;
          case "SITable":
            SITable();
            continue;
          case "Average speed":
            AverageSpeed();
            continue;
          case "Time convert":
            ConversionTableTIME();
            continue;
          case "clear":
            System.out.print("\033[H\033[2J");
            System.out.flush();
          default:
            System.out.println("ERROR: INVALID INPUT!");
            continue;
        
        }
      }
      catch(Exception e)
      {
        System.out.println("ERROR: INVALID INPUT!");
      }
      break;
    }
  
  }
  
  public static void main(String args[])
  {
    System.out.println();
    System.out.println("==============================================================");
    System.out.println("**********************PHYSICS CALCULATOR**********************");
    System.out.println("==============================================================");
    System.out.println("Type --help for help");
    System.out.println();
    RunProgram();
    System.out.println("==============================================================");
  }
}
