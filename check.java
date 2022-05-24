  import java.util.Scanner;
  class usernameException extends Exception
  {
      public usernameException(String msg)
      {
          super(msg);
      }
  }
  class passwordException extends Exception
  {
      public passwordException(String msg)
      {
          super(msg);
      }
  }
  public class check
  {
      public static void main(String args[])
      {
          Scanner s=new Scanner(System.in);
          String username,password;
          System.out.println("enter username");
          username=s.nextLine();
          System.out.println("enter password");
          password=s.nextLine();
          int length=username.length();
          try
          {
              if(length<6)
              throw new usernameException("username must be greater than 6 characters");
              else if(!password.equals("hellow"))
              throw new passwordException("incorrect password\n type correct password");
              else
              System.out.println("login successful");
          }
          catch(usernameException u)
          {
              u.printStackTrace();

          }
          catch(passwordException p)
          {
              p.printStackTrace();
          }
          finally
          {
              System.out.println("the final statement is executed");
          }
      }

  }