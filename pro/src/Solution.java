import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

import org.omg.CORBA.DynAnyPackage.Invalid;

public class Solution {
public static void main(String... args)
{
String filename="INPUT.txt";
List<policy> list= read_file(filename);
int opt;
@SuppressWarnings("resource")
Scanner scanner= new Scanner(System.in);
System.out.println("Enter your choice \n 1. Find expired policy details\n 2. Find Policy cost per vendor");
opt=scanner.nextInt();



while(opt==1)
   {
for(policy i : list)
{
Date conv = new Date();
SimpleDateFormat b  = new SimpleDateFormat("dd/MM/yyyy");

Date d;
try {
d = b.parse(i.getDoe());


if(d.getTime() >= conv.getTime()){

}else
{
    
  throw new Invalid(); 
}

} catch (ParseException | Invalid e) {
// TODO Auto-generated catch block
System.out.println("policy No"+" "+ i.getPolicy()+ " " +"is expired");
}

}
break;
   }


while(opt==2)
{

for(policy j : list)
{
j.setPolicy(j.getPolicy().substring(0, 2));
}
Map<String, Integer> sum = list.stream().collect(
       Collectors.groupingBy(policy::getPolicy, Collectors.summingInt(policy::getCost)));
System.out.println(sum);
break;
}
}

public static List<policy> read_file(String a)
{List<policy> ins =new ArrayList<>();
try
{


BufferedReader br = new BufferedReader (new FileReader(a));

String line;
line=br.readLine();
while(line!=null)
{
String[] attr = line.split(" ");
policy obj = new policy(attr[0],Integer.parseInt(attr[1]),attr[2],attr[3],attr[4],attr[5]);
ins.add(obj);
line=br.readLine();

}
br.close();
}
catch(IOException ioe)
{
ioe.printStackTrace();
}

return ins;

}
}
