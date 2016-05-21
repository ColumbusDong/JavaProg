public class Bleh
{
     public static void main(String[] args) {
       String Team =“Bulldogs life”;
int j;

for (j = 1; j < Team.length()&& Team.charAt(j) != '%'; j++)
    Team = Team.replace(Team.charAt(j), '%');

System.out.println(Team);
     }
}