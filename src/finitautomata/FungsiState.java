/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package finitautomata;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Jefri Yushendri
 */
public class FungsiState {
    public FungsiState(){
        
    }
    
    
    
    
 static void cekToken(Map<String, String[][]> state,char[] token, javax.swing.JTextArea jHasil) {
		boolean check = true;

		String[][] Q = state.get("Q0");
		for (int i = 0; i < token.length; i++) {
			for (int j = 0; j < Q.length; j++) {
				if (String.valueOf(token[i]).equalsIgnoreCase(Q[j][0])) {
					jHasil.append(Q[j][0]+"   (");
					jHasil.append(Q[j][1]+")\n");
					Q = state.get(Q[j][1]);
					check = true;
					break;
				} else {
					check = false;
				}
			}
			if (check == false) {
				jHasil.append(String.valueOf(token[i]) + "--WRONG--\n");
				i = token.length;
			}
		}
		if (!Q[0][0].equalsIgnoreCase("END") || check == false) {
			jHasil.append("\nNAMA TIDAK TERSEDIA");
		} else {
			jHasil.append("\nNAMA TERSEDIA");
		}
	}   
    
    
 public Map<String, String[][]> state() {
		Map<String, String[][]> state = new HashMap<String, String[][]>();
		state.put("Qend", new String[][] { { "END", "END" } });
		state.put("Q0",
				new String[][] { { "A", "Q1" }, { "B", "Q2" }, { "D", "Q3" },
						{ "E", "Q4" }, { "F", "Q5" }, { "G", "Q6" },
						{ "H", "Q7" }, { "I", "Q8" }, { "J", "Q9" },
						{ "M", "Q10" }, { "P", "Q11" }, { "R", "Q12" },
						{ "S", "Q13" }, { "Y", "Q14" } });
		state.put("Q1", new String[][] { { "L", "Q1s1" }, { "N", "Q1s2" },
				{ "R", "Q1s3" }, { "X", "Q1s4" } });
		// Alvian
		state.put("Q1s1", new String[][] { { "V", "Q1s11" } });
		state.put("Q1s11", new String[][] { { "I", "Q1s12" } });
		state.put("Q1s12", new String[][] { { "A", "QendN" } });
		state.put("QendN", new String[][] { { "N", "Qend" } });// END
		// Andrey,Andi,Angga
		state.put("Q1s2",
				new String[][] { { "D", "Q1s211" }, { "G", "Q1s221" } });
		state.put("Q1s211",
				new String[][] { { "I", "Qend" }, { "R", "Q1s212" } });
		state.put("Q1s212", new String[][] { { "E", "QendY" } });
		state.put("QendY", new String[][] { { "Y", "Qend" } });// END
		state.put("Q1s221", new String[][] { { "G", "QendA" } });
		state.put("QendA", new String[][] { { "A", "Qend" } });// END
		// Arie,Arvyn
		state.put("Q1s3",
				new String[][] { { "I", "QendE" }, { "V", "Q1s321" } });
		state.put("QendE", new String[][] { { "E", "Qend" } });
		state.put("Q1s321", new String[][] { { "Y", "QendN" } });
		// Axel
		state.put("Q1s4", new String[][] { { "E", "QendL" } });
		state.put("QendL", new String[][] { { "L", "Qend" } });// END

		// Baweh
		state.put("Q2", new String[][] { { "A", "Q2s1" } });
		state.put("Q2s1", new String[][] { { "W", "Q2s2" } });
		state.put("Q2s2", new String[][] { { "E", "QendH" } });
		state.put("QendH", new String[][] { { "H", "Qend" } });// END
		// Debby
		state.put("Q3", new String[][] { { "E", "Q3s1" } });
		state.put("Q3s1", new String[][] { { "B", "Q3s2" } });
		state.put("Q3s2", new String[][] { { "B", "QendY" } });
		// Edwin,Ele,Eva
		state.put("Q4", new String[][] { { "D", "Q4s11" }, { "L", "QendE" },
				{ "V", "QendA" } });
		state.put("Q4s11", new String[][] { { "W", "Q4s12" } });
		state.put("Q4s12", new String[][] { { "I", "QendN" } });
		// FAISAL,FERDI,FIENA
		state.put("Q5", new String[][] { { "A", "Q5s11" }, { "E", "Q5s21" },
				{ "I", "Q5s31" } });
		state.put("Q5s11", new String[][] { { "I", "Q5s12" } });
		state.put("Q5s12", new String[][] { { "S", "QendAL" } });
		state.put("QendAL", new String[][] { { "A", "QendL" } });// END-AL
		state.put("Q5s21", new String[][] { { "R", "QendDI" } });
		state.put("QendDI", new String[][] { { "D", "QendI" } });
		state.put("QendI", new String[][] { { "I", "Qend" } });// END-NA
		state.put("Q5s31", new String[][] { { "E", "QendNA" } });
		state.put("QendNA", new String[][] { { "N", "QendA" } });// END-NA
		// Gerry
		state.put("Q6", new String[][] { { "E", "Q6s1" } });
		state.put("Q6s1", new String[][] { { "R", "Q6s2" } });
		state.put("Q6s2", new String[][] { { "R", "QendY" } });
		// Hasan
		state.put("Q7", new String[][] { { "A", "Q7s1" } });
		state.put("Q7s1", new String[][] { { "S", "Q7s2" } });
		state.put("Q7s2", new String[][] { { "A", "QendN" } });
		// Ijal
		state.put("Q8", new String[][] { { "J", "QendAL" } });
		// JEFRI
		state.put("Q9", new String[][] { { "E", "Q9s1" } });
		state.put("Q9s1", new String[][] { { "F", "Q9s2" } });
		state.put("Q9s2", new String[][] { { "R", "QendI" } });
		// MARINA,MUTI
		state.put("Q10",
				new String[][] { { "A", "Q10s11" }, { "U", "Q10s21" } });
		state.put("Q10s11", new String[][] { { "R", "Q10s12" } });
		state.put("Q10s12", new String[][] { { "I", "QendNA" } });
		state.put("Q10s21", new String[][] { { "T", "QendI" } });

		// PRILLY
		state.put("Q11", new String[][] { { "R", "Q11s1" } });
		state.put("Q11s1", new String[][] { { "I", "Q11s2" } });
		state.put("Q11s2", new String[][] { { "L", "Q11s3" } });
		state.put("Q11s3", new String[][] { { "L", "QendY" } });
		// RICHAD,RUSTAM,RIZKY
		state.put("Q12",
				new String[][] { { "I", "Q12s11" }, { "U", "Q12s21" } });
		state.put("Q12s11", new String[][] { { "C", "Q12s111" },
				{ "Z", "Q12s121" } });
		state.put("Q12s111", new String[][] { { "H", "Q12s112" } });
		state.put("Q12s112", new String[][] { { "A", "QendD" } });
		state.put("QendD", new String[][] { { "D", "Qend" } });// END
		state.put("Q12s121", new String[][] { { "K", "QendY" } });
		state.put("Q12s21", new String[][] { { "S", "Q12s22" } });
		state.put("Q12s22", new String[][] { { "T", "Q12s23" } });
		state.put("Q12s23", new String[][] { { "A", "QendM" } });
		state.put("QendM", new String[][] { { "M", "Qend" } });
		// SURYADI

		state.put("Q13", new String[][] { { "U", "Q13s1" } });
		state.put("Q13s1", new String[][] { { "R", "Q13s2" } });
		state.put("Q13s2", new String[][] { { "Y", "Q13s3" } });
		state.put("Q13s3", new String[][] { { "A", "QendDI" } });
		// YOHANES

		state.put("Q14", new String[][] { { "O", "Q14s1" } });
		state.put("Q14s1", new String[][] { { "H", "Q14s2" } });
		state.put("Q14s2", new String[][] { { "A", "Q14s3" } });
		state.put("Q14s3", new String[][] { { "N", "Q14s4" } });
		state.put("Q14s4", new String[][] { { "E", "QendS" } });
		state.put("QendS", new String[][] { { "S", "Qend" } });
                
                return state;

	}
    
}
