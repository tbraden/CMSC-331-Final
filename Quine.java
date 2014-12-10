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
    "    for(int i = 0; i <= 57; i++)",
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
    "for x in range(46,48):",
    "    print l[x]",
    "for x in range(0,58):",
    "    print l[0] + q + l[x] + q + ','",
    "for x in range(48,58):",
    "    print l[x]",
    "=============<<<<<<<< Ruby Code >>>>>>>>=============",
    "q = 34.chr",
    "l = [",
    "]",
    "for i in 20..25",
    "  puts l[i]",
    "end",
    "for i in 0..57",
    "  puts l[0] + q + l[i] + q + ','",
    "end",
    "for i in 26..34",
    "  puts l[i]",
    "end",
    };
    for(int i = 2; i <= 9; i++)
        System.out.println(l[i]);
    for(int i = 0; i < l.length; i++)
        System.out.println( l[0] + q + l[i] + q + ',' );
    for(int i = 10; i <= 18; i++)
        System.out.println(l[i]);
  }
}
