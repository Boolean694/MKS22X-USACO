import java.util.*;
import java.io.*;
public class USACO {
  public static int bronze(String fn) throws FileNotFoundException {
    File f = new File(fn);
    Scanner in = new Scanner(f);
    String firstl = in.nextLine();
    String rowst = "";
    int irc = 0;
    while(firstl.charAt(irc) != ' ' && irc < firstl.length()) {
      rowst += firstl.charAt(irc);
      irc++;
    }
    int rc = Integer.parseInt(rowst);
    irc++;
    String colst = "";
    while(firstl.charAt(irc) != ' ' && irc < firstl.length()) {
      colst += firstl.charAt(irc);
      irc++;
    }
    int cc = Integer.parseInt(colst);
    irc++;
    String estr = "";
    while(firstl.charAt(irc) != ' ' && irc < firstl.length()) {
      estr += firstl.charAt(irc);
      irc++;
    }
    int elev = Integer.parseInt(estr);
    irc++;
    String nmst = "";
    while(irc < firstl.length() && firstl.charAt(irc) != ' ' ) {
      nmst += firstl.charAt(irc);
      irc++;
    }
    int nmoves = Integer.parseInt(nmst);
    int[][] board = new int[rc][cc];
    for(int q = 0; q < rc; q++) {
      String arra = in.nextLine();
      int cco = 0;
      String tempst = "";
      int qwe = 0;
      int tcc = 0;
      while(qwe < arra.length()) {
        while(qwe < arra.length() && arra.charAt(qwe) != ' ') {
          tempst += arra.charAt(qwe);
          qwe++;
        }
        board[q][tcc] = Integer.parseInt(tempst);
        tempst = "";
        tcc++;
        qwe++;
      }
    }
    int[][] copy = new int[rc][cc];
    for(int azsx = 0; azsx < copy.length; azsx++) {
      for(int sxaz = 0; sxaz < copy[azsx].length; sxaz++) {
        copy[azsx][sxaz] = board[azsx][sxaz];
      }
    }
    String[] mlistu = new String[nmoves];
    for(int w = 0; w < nmoves; w++) {
      mlistu[w] = in.nextLine();
    }
    int[][] mlist = new int[nmoves][3];
    for(int eded = 0; eded < mlistu.length; eded++) {
      String stst = "";
      String mses = mlistu[eded];
      int uio = 0;
      int adta = 0;
      while(uio < mses.length()) {
        while(uio < mses.length() && mses.charAt(uio) != ' ') {
          stst += mses.charAt(uio);
          uio++;
        }
        mlist[eded][adta] = Integer.parseInt(stst);
        adta++;
        uio++;
        stst = "";
      }
    }
    return 1;
  }
  public static void main(String[] asdfsdhfk) {
    try {
      USACO.bronze("makelake.1.in");
    }
    catch(FileNotFoundException e) {System.out.println("asdfsadf");}
  }
}
