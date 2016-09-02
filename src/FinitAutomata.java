import finitautomata.FungsiState;
import java.util.HashMap;
import java.util.Map;

public class FinitAutomata {

	static Map<String, String[][]> state;

	public static void main(String[] args) {
            FungsiState instate = new FungsiState();
            state=instate.state();
            
		String nama = "JEFRI";
		char[] token = nama.replaceAll("\\W", "").toCharArray();
		cekToken(token);
		/*
		 * for(int i=0;i<=28;i++){ cetakNamaAcak(); cetak("\n"); }
		 */
	}

	

	static void cekToken(char[] token) {
		boolean check = true;

		String[][] Q = state.get("Q0");
		for (int i = 0; i < token.length; i++) {
			for (int j = 0; j < Q.length; j++) {
				if (String.valueOf(token[i]).equalsIgnoreCase(Q[j][0])) {
					cetak(Q[j][0]);
					cetakbr(Q[j][1]);
					Q = state.get(Q[j][1]);
					check = true;
					break;
				} else {
					check = false;
				}
			}
			if (check == false) {
				cetakbr(String.valueOf(token[i]) + "--WRONG--");
				i = token.length;
			}
		}
		if (!Q[0][0].equalsIgnoreCase("END") || check == false) {
			cetakbr("\nNAMA TIDAK TERSEDIA");
		} else {
			cetakbr("\nNAMA TERSEDIA");
		}
	}

	static void cetakNamaAcak() {
		String[][] Q = state.get("Q0");
		boolean check = true;
		int i;
		while (check) {
			i = (int) Math.floor(Math.random() * (Q.length));
			cetak(Q[i][0]);
			Q = state.get(Q[i][1]);
			if (Q[0][0].equalsIgnoreCase("END")) {
				break;

			}
		}
	}

	static void cetak(String a) {
		System.out.print(a);
	}

	static void cetakbr(String a) {
		System.out.println(a);
	}

}
