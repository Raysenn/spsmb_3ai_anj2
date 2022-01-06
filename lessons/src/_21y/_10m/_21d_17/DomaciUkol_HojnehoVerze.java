package _21y._10m._21d_17;
import java.util.Scanner;
public class DomaciUkol_HojnehoVerze {


//Hojný public static int obvodObdelnika(int stranaA, int stranaB)
        public static void main(String[]args) {
            Scanner sc = new Scanner(System.in);
            Scanner in = new Scanner(System.in);
            Scanner let = new Scanner(System.in);

            System.out.println();
            System.out.println("Tento program vám vypočítá obvod obdelníka pokud víme délku strany A a délku strany B");
            System.out.println();
            String c = "mm";
            String d = "cm";
            String e = "dm";
            String f = "m";

            System.out.println("Zadejte jednotku délky strany A (mm=milimetr, cm=centimetr, dm=decimetr a m=metr):");
            String g = sc.nextLine();


            System.out.println("Dálka strany A:");
            int a = sc.nextInt();


            System.out.println("Zadejte jednotku délky strany B (mm=milimetr, cm=centimetr, dm=decimetr a m=metr):");
            String h = in.nextLine();

            System.out.println("Dálka strany B:");
            int b = sc.nextInt();

            System.out.println("Zadejte v jakých jednotkách chcete výsledek (mm=milimetr, cm=centimetr, dm=decimetr a m=metr):");
            String i = let.nextLine();


            if (new String(g).equals(h)) {
                if (new String(g).equals(i)) {
                    System.out.println("Obvod obdelníka je " + 2 * (a + b) + g);
                } else if (!new String(g).equals(i)) {
                    if (new String(i).equals(c) && g.equals(d)) {
                        System.out.println("Obvod obdelníka je " + (2 * (a + b)) * 10 + c);
                    } else if (new String(i).equals(c) && new String(g).equals(e)) {
                        System.out.println("Obvod obdelníka je " + (2 * (a + b)) * 100 + c);
                    } else if (new String(i).equals(c) && new String(g).equals(f)) {
                        System.out.println("Obvod obdelníka je " + (2 * (a + b)) * 1000 + c);
                    } else if (new String(i).equals(d) && new String(g).equals(f)) {
                        System.out.println("Obvod obdelníka je " + (2 * (a + b)) * 100 + d);
                    } else if (new String(i).equals(d) && new String(g).equals(e)) {
                        System.out.println("Obvod obdelníka je " + (2 * (a + b)) * 10 + d);
                    } else if (new String(i).equals(d) && new String(g).equals(c)) {
                        System.out.println("Obvod obdelníka je " + (2 * (a + b)) / 10 + d);
                    } else if (new String(i).equals(e) && new String(g).equals(f)) {
                        System.out.println("Obvod obdelníka je " + (2 * (a + b)) * 10 + e);
                    } else if (new String(i).equals(e) && g.equals(e)) {
                        System.out.println("Obvod obdelníka je " + (2 * (a + b)) / 10 + e);
                    } else if (new String(i).equals(e) && new String(g).equals(c)) {
                        System.out.println("Obvod obdelníka je " + (2 * (a + b)) / 100 + e);
                    } else if (new String(i).equals(f) && new String(g).equals(f)) {
                        System.out.println("Obvod obdelníka je " + (2 * (a + b)) / 10 + f);
                    } else if (new String(i).equals(f) && new String(g).equals(e)) {
                        System.out.println("Obvod obdelníka je " + (2 * (a + b)) / 100 + f);
                    } else if (new String(i).equals(f) && new String(g).equals(c)) {
                        System.out.println("Obvod obdelníka je " + (2 * (a + b)) / 1000 + f);
                    }
                }
            }

            if (!new String(g).equals(h)) {
                if (new String(i).equals(c) && new String(g).equals(c) && new String(h).equals(d)) {
                    System.out.println("Obvod obdelníka je " + (2 * (a + b*10)) + c);
                }else if (new String(i).equals(c) && new String(g).equals(c) && new String(h).equals(e)) {
                    System.out.println("Obvod obdelníka je " + (2 * (a + b*100)) + c);
                }else if (new String(i).equals(c) && new String(g).equals(c) && new String(h).equals(f)) {
                    System.out.println("Obvod obdelníka je " + (2 * (a + b*1000)) + c);
                }else if (new String(i).equals(c) && new String(g).equals(d) && new String(h).equals(c)) {
                    System.out.println("Obvod obdelníka je " + (2 * (a * 10 + b)) + c);
                }else if (new String(i).equals(c) && new String(g).equals(d) && new String(h).equals(e)) {
                    System.out.println("Obvod obdelníka je " + (2 * (a * 10 + b * 100)) + c);
                } else if (new String(i).equals(c) && new String(g).equals(d) && new String(h).equals(f)) {
                    System.out.println("Obvod obdelníka je " + (2 * (a * 10 + b * 1000)) + c);
                } else if (new String(i).equals(c) && new String(g).equals(e) && new String(h).equals(c)) {
                    System.out.println("Obvod obdelníka je " + (2 * (a * 100 + b)) + c);
                } else if (new String(i).equals(c) && new String(g).equals(e) && new String(h).equals(d)) {
                    System.out.println("Obvod obdelníka je " + (2 * (a * 100 + b * 10)) + c);
                } else if (new String(i).equals(c) && new String(g).equals(e) && new String(h).equals(f)) {
                    System.out.println("Obvod obdelníka je " + (2 * (a * 100 + b * 1000)) + c);
                } else if (new String(i).equals(c) && new String(g).equals(f) && new String(h).equals(c)) {
                    System.out.println("Obvod obdelníka je " + (2 * (a * 1000 + b)) + c);
                } else if (new String(i).equals(c) && new String(g).equals(f) && new String(h).equals(d)) {
                    System.out.println("Obvod obdelníka je " + (2 * (a * 1000 + b * 10)) + c);
                } else if (new String(i).equals(c) && new String(g).equals(f) && new String(h).equals(e)) {
                    System.out.println("Obvod obdelníka je " + (2 * (a * 1000 + b * 100)) + c);
                }

                else if (new String(i).equals(d) && new String(g).equals(c) && new String(h).equals(d)) {
                    System.out.println("Obvod obdelníka je " + (2 * (a/10 + b)) + d);
                }else if (new String(i).equals(d) && new String(g).equals(c) && new String(h).equals(e)) {
                    System.out.println("Obvod obdelníka je " + (2 * (a/10 + b*10)) + d);
                }else if (new String(i).equals(d) && new String(g).equals(c) && new String(h).equals(f)) {
                    System.out.println("Obvod obdelníka je " + (2 * (a/10 + b*100)) + d);
                }else if (new String(i).equals(d) && new String(g).equals(d) && new String(h).equals(c)) {
                    System.out.println("Obvod obdelníka je " + (2 * (a + b / 10)) + d);
                } else if (new String(i).equals(d) && new String(g).equals(d) && new String(h).equals(e)) {
                    System.out.println("Obvod obdelníka je " + (2 * (a + b * 10)) + d);
                } else if (new String(i).equals(d) && new String(g).equals(d) && new String(h).equals(f)) {
                    System.out.println("Obvod obdelníka je " + (2 * (a + b * 100)) + d);
                } else if (new String(i).equals(d) && new String(g).equals(e) && new String(h).equals(c)) {
                    System.out.println("Obvod obdelníka je " + (2 * (a * 10 + b / 10)) + d);
                } else if (new String(i).equals(d) && new String(g).equals(e) && new String(h).equals(d)) {
                    System.out.println("Obvod obdelníka je " + (2 * (a * 10 + b)) + d);
                } else if (new String(i).equals(d) && new String(g).equals(e) && new String(h).equals(f)) {
                    System.out.println("Obvod obdelníka je " + (2 * (a * 10 + b * 100)) + d);
                } else if (new String(i).equals(d) && new String(g).equals(f) && new String(h).equals(c)) {
                    System.out.println("Obvod obdelníka je " + (2 * (a * 100 + b / 10)) + d);
                } else if (new String(i).equals(d) && new String(g).equals(f) && new String(h).equals(d)) {
                    System.out.println("Obvod obdelníka je " + (2 * (a * 100 + b)) + d);
                } else if (new String(i).equals(d) && new String(g).equals(f) && new String(h).equals(e)) {
                    System.out.println("Obvod obdelníka je " + (2 * (a * 100 + b * 10)) + d);
                }



                else if (new String(i).equals(e) && new String(g).equals(c) && new String(h).equals(d)) {
                    System.out.println("Obvod obdelníka je " + (2 * (a/100 + b/10)) + e);
                }else if (new String(i).equals(e) && new String(g).equals(c) && new String(h).equals(e)) {
                    System.out.println("Obvod obdelníka je " + (2 * (a/100 + b)) + e);
                }else if (new String(i).equals(e) && new String(g).equals(c) && new String(h).equals(f)) {
                    System.out.println("Obvod obdelníka je " + (2 * (a/100 + b*10)) + e);
                }else if (new String(i).equals(e) && new String(g).equals(d) && new String(h).equals(c)) {
                    System.out.println("Obvod obdelníka je " + (2 * (a / 10 + b / 100)) + e);
                } else if (new String(i).equals(e) && new String(g).equals(d) && new String(h).equals(e)) {
                    System.out.println("Obvod obdelníka je " + (2 * (a / 10 + b)) + e);
                } else if (new String(i).equals(e) && new String(g).equals(d) && new String(h).equals(f)) {
                    System.out.println("Obvod obdelníka je " + (2 * (a / 10 + b * 10)) + e);
                } else if (new String(i).equals(e) && new String(g).equals(e) && new String(h).equals(c)) {
                    System.out.println("Obvod obdelníka je " + (2 * (a + b / 100)) + e);
                } else if (new String(i).equals(e) && new String(g).equals(e) && new String(h).equals(d)) {
                    System.out.println("Obvod obdelníka je " + (2 * (a + b / 10)) + e);
                } else if (new String(i).equals(e) && new String(g).equals(e) && new String(h).equals(f)) {
                    System.out.println("Obvod obdelníka je " + (2 * (a + b * 10)) + e);
                } else if (new String(i).equals(e) && new String(g).equals(f) && new String(h).equals(c)) {
                    System.out.println("Obvod obdelníka je " + (2 * (a * 10 + b / 100)) + e);
                } else if (new String(i).equals(e) && new String(g).equals(f) && new String(h).equals(d)) {
                    System.out.println("Obvod obdelníka je " + (2 * (a * 10 + b / 10)) + e);
                } else if (new String(i).equals(e) && new String(g).equals(f) && new String(h).equals(e)) {
                    System.out.println("Obvod obdelníka je " + (2 * (a * 10 + b)) + e);
                }



                else if (new String(i).equals(f) && new String(g).equals(c) && new String(h).equals(d)) {
                    System.out.println("Obvod obdelníka je " + (2 * (a/1000 + b/100)) + f);
                }else if (new String(i).equals(f) && new String(g).equals(c) && new String(h).equals(e)) {
                    System.out.println("Obvod obdelníka je " + (2 * (a/1000 + b/10)) + f);
                }else if (new String(i).equals(f) && new String(g).equals(c) && new String(h).equals(f)) {
                    System.out.println("Obvod obdelníka je " + (2 * (a/1000 + b)) + f);
                } else if (new String(i).equals(f) && new String(g).equals(d) && new String(h).equals(c)) {
                    System.out.println("Obvod obdelníka je " + (2 * (a / 100 + b / 1000)) + f);
                } else if (new String(i).equals(f) && new String(g).equals(d) && new String(h).equals(e)) {
                    System.out.println("Obvod obdelníka je " + (2 * (a / 100 + b / 10)) + f);
                } else if (new String(i).equals(f) && new String(g).equals(d) && new String(h).equals(f)) {
                    System.out.println("Obvod obdelníka je " + (2 * (a / 100 + b)) + f);
                } else if (new String(i).equals(f) && new String(g).equals(e) && new String(h).equals(c)) {
                    System.out.println("Obvod obdelníka je " + (2 * (a / 10 + b / 1000)) + f);
                } else if (new String(i).equals(f) && new String(g).equals(e) && new String(h).equals(d)) {
                    System.out.println("Obvod obdelníka je " + (2 * (a / 10 + b / 100)) + f);
                } else if (new String(i).equals(f) && new String(g).equals(e) && new String(h).equals(f)) {
                    System.out.println("Obvod obdelníka je " + (2 * (a / 10 + b)) + f);
                } else if (new String(i).equals(f) && new String(g).equals(f) && new String(h).equals(c)) {
                    System.out.println("Obvod obdelníka je " + (2 * (a + b / 1000)) + e);
                } else if (new String(i).equals(f) && new String(g).equals(f) && new String(h).equals(d)) {
                    System.out.println("Obvod obdelníka je " + (2 * (a + b / 100)) + e);
                } else if (new String(i).equals(f) && new String(g).equals(f) && new String(h).equals(e)) {
                    System.out.println("Obvod obdelníka je " + (2 * (a + b / 10)) + e);
                }
            }

        }
}
