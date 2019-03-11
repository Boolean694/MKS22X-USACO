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
    for(int mco = 0; mco < mlist.length; mco++) {
      int sr = mlist[mco][0] - 1;
      int sc = mlist[mco][1] - 1;
      int ln = 0;
      int lnr = 0;
      int lnc = 0;
      for(int mrco = 0; mrco < 3; mrco++) {
        for(int mcco = 0; mcco < 3; mcco++) {
          if(board[sr + mrco][sc + mcco] > ln) {
            ln = board[sr + mrco][sc + mcco];
            lnr = sr + mrco;
            lnc = sc + mcco;
          }
        }
      }
      board[lnr][lnc] -= mlist[mco][2];
      ln -= mlist[mco][2];
      for(int smrc = 0; smrc < 3; smrc++) {
        for(int smcc = 0; smcc < 3; smcc++) {
          if(board[sr + smrc][sc + smcc] > ln) {
            board[sr + smrc][sc + smcc] = ln;
          }
        }
      }
    }
    for(int rfv = 0; rfv < board.length; rfv++) {
      for(int edc = 0; edc < board[rfv].length; edc++) {
        if(board[rfv][edc] < 0) {
          board[rfv][edc] = 0;
        }
      }
    }
    for(int dtr = 0; dtr < board.length; dtr++) {
      for(int dtc = 0; dtc < board[dtr].length; dtc++) {
        if(elev - board[dtr][dtc] <= 0) {
          copy[dtr][dtc] = 0;
        }
        else {
          copy[dtr][dtc] = elev - board[dtr][dtc];
        }
      }
    }
    int ret = 0;
    for(int finr = 0; finr < copy.length; finr++) {
      for(int finc = 0; finc < copy[finr].length; finc++) {
        ret += 5184 * copy[finr][finc];
      }
    }
    return ret;
  }
  public static int silver(String sf) throws FileNotFoundException {
    File ftwo = new File(sf);
    Scanner insc = new Scanner(ftwo);
    String flt = insc.nextLine();
    String temr = "";
    int flco = 0;
    while(flt.charAt(flco) != ' ' && flco < flt.length()) {
      temr += flt.charAt(flco);
      flco++;
    }
    int rct = Integer.parseInt(temr);
    flco++;
    String temc = "";
    while(flt.charAt(flco) != ' ' && flco < flt.length()) {
      temc += flt.charAt(flco);
      flco++;
    }
    int cct = Integer.parseInt(temc);
    flco++;
    String temt = "";
    while(flco < flt.length()) {
      temt += flt.charAt(flco);
      flco++;
    }
    int sec = Integer.parseInt(temt);
    boolean[][] tboard = new boolean[rct][cct];
    for(int q = 0; q < rct; q++) {
      String bol = insc.nextLine();
      for(int w = 0; w < cct; w++) {
        if(bol.charAt(w) == '.') {
          tboard[q][w] = true;
        }
        else {
          tboard[q][w] = false;
        }
      }
    }
    String ll = insc.nextLine();
    int cll = 0;
    String x1s = "";
    while(ll.charAt(cll) != ' ') {
      x1s += ll.charAt(cll);
      cll++;
    }
    int x1 = Integer.parseInt(x1s);
    cll++;
    String y1s = "";
    while(ll.charAt(cll) != ' ') {
      y1s += ll.charAt(cll);
      cll++;
    }
    int y1 = Integer.parseInt(y1s);
    cll++;
    String x2s = "";
    while(ll.charAt(cll) != ' ') {
      x2s += ll.charAt(cll);
      cll++;
    }
    int x2 = Integer.parseInt(x2s);
    cll++;
    String y2s = "";
    while(cll < ll.length()) {
      y2s += ll.charAt(cll);
      cll++;
    }
    int y2 = Integer.parseInt(y2s);
    return 1;
  }
  public static void main(String[] asdfsdhfk) {
    try {
      USACO.silver("ctravel.1.in");
    }
    catch(FileNotFoundException e) {System.out.println("asdfsadf");}
  }
}
