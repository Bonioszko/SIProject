package com.sample;
import javax.swing.JOptionPane;


public class gui {
	public static String processQuestion(String q) {
        Object[] options = {"Yes",
                            "No"};

        int n = JOptionPane.showOptionDialog(null,
                                             q,
                                             "",
                                             JOptionPane.YES_NO_OPTION,
                                             JOptionPane.QUESTION_MESSAGE,
                                             null,
                                             options,
                                             options[0]);
        return options[n].toString();
}

	public static void showResult(String q) {
        JOptionPane.showMessageDialog(null, q, "Here is your result:", JOptionPane.PLAIN_MESSAGE);  
}
}
