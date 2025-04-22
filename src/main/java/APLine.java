public class APLine
{
  /* your code here */
  private int a,b,c;
  public APLine(int x, int y, int z){
    a=x;
    b=y;
    c=z;
  }
  public double getslope(){
    return (double)a/-b;
  }
  public boolean isOnLine(int x, int y){
    if(a*x+b*y+c ==0){
      return true;
    }
    return false;
  }
}
