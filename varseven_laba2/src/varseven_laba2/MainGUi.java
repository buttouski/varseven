package varseven_laba2;

import java.awt.*;
import java.awt.event.*;
import java.util.Arrays;

import javax.swing.*;


public class MainGUi extends JFrame {
    private static final long serialVersionUID = 1L;

    private JButton button = new JButton("Старт");
    private JLabel label = new JLabel("Нажмите кнопку \"Старт\" чтобы сгенерировать числа");

    public MainGUi() {

    	super("Генерация чисел");
        this.setBounds(500, 200, 500, 500);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container container = this.getContentPane();
        container.setLayout(new GridBagLayout());

        // паддинги для инпутов и тд
        label.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.insets = new Insets(50, 50, 50, 50); // установите нужные вам отступы
        container.add(label, gbc);

        gbc.gridy = 1;
        gbc.insets = new Insets(10, 50, 10, 50); // установите нужные вам отступы
        container.add(button, gbc);

        button.addActionListener(new ButtonEventListener());

    }

    
    class ButtonEventListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String message = "Результат генерации:\n\n";

            // Генерируем случайные числа
            int randomNumber = RandomNumberGenerator.generateRandomNumber();
            message += "Сгенерированное число: " + randomNumber + "\n";
            
            // одномерный массив
            int[] array = ArrayGenerator.generateArray();
            message += "Массив: " + Arrays.toString(array) + "\n";
            
            // Сортируем массив
            BubbleSort.bubbleSort(array);
            message += "Отсортированный массив: " + Arrays.toString(array) + "\n";
            
            // max-min
            int difference = ArrayCalculator.calculateDifference(array);
            message += "Разница между наибольшим и наименьшим элементами: " + difference + "\n";

            // квадратный корень из числа полученного в результате разницы
            double squareRoot = MathSolver.calculateSquareRoot(difference);
            message += "Квадратный корень из разницы: " + squareRoot + "\n";

            JOptionPane.showMessageDialog(null, message, "Результат", JOptionPane.PLAIN_MESSAGE);

        }

    }
}