public class Quine
{
  public static void main( String[] args )
  {
    char q = 34;
    String[] l = {
    "    ",
    "=============<<<<<<<< C++ Code >>>>>>>>=============",
    "#include <iostream>",
    "#include <string>",
    "using namespace std;",
    "",
    "int main(int argc, char* argv[])",
    "{",
    "    char q = 34;",
    "    string l[] = {",
    "    };",
    "    for(int i = 36; i <= 37; i++)",
    "        cout << l[i] << endl;",
    "    for(int i = 0; i <= 44; i++)",
    "        cout << l[0] + q + l[i] + q + ',' << endl;",
    "    for(int i = 38; i <= 44; i++)",
    "        cout << l[i] << endl;",
    "    return 0;",
    "}",
    "=============<<<<<<<< Java Code >>>>>>>>==========",
    "public class Quine",
    "{",
    "  public static void main( String[] args )",
    "  {",
    "    char q = 34;",
    "    String[] l = {",
    "    };",
    "    for(int i = 2; i <= 9; i++)",
    "        System.out.println(l[i]);",
    "    for(int i = 0; i < l.length; i++)",
    "        System.out.println( l[0] + q + l[i] + q + ',' );",
    "    for(int i = 10; i <= 18; i++)",
    "        System.out.println(l[i]);",
    "  }",
    "}",
    "=============<<<<<<<< Python Code >>>>>>>>===========",
    "q = chr(34)",
    "l = [",
    "]",
    "for x in range(20,26):",
    "    print l[x]",
    "for x in range(0,45):",
    "    print l[0] + q + l[x] + q + ','",
    "for x in range(26,35):",
    "    print l[x]",
    };
    for(int i = 2; i <= 9; i++)
        System.out.println(l[i]);
    for(int i = 0; i < l.length; i++)
        System.out.println( l[0] + q + l[i] + q + ',' );
    for(int i = 10; i <= 18; i++)
        System.out.println(l[i]);
  }
}
