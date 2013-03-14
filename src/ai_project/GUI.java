package ai_project;

import java.util.Vector;
import ai_project.Algorithm.Pair;
public class GUI extends javax.swing.JFrame {

    Algorithm alg = new Algorithm();
    public Vector<Pair<String,Integer>> vec = new Vector<Pair<String,Integer>>();
          
    String prt;
    
    int i = 0;
    public GUI() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        subject = new javax.swing.JComboBox();
        add = new javax.swing.JButton();
        grade = new javax.swing.JComboBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableSubject = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableGrade = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        suggest = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        tableSuggested = new javax.swing.JTable();
        delete = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        delSubjectNum = new javax.swing.JComboBox();
        jScrollPane3 = new javax.swing.JScrollPane();
        tableNumber = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Система за препоръчване на Магистърска програма");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        subject.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Адитивни задачи в теорията на числата", "Алгебра II", "Алгебрична и хомотопична топология", "Алгоритмични основи на компютърната графика", "Анализ на Клифорд за диференциални уравнения", "Бази от данни", "Бази от данни-практикум - спец. ИС", "Бейсов подход при анализа на данни", "Бързи алгоритми върху структура от данни", "Вероятностни модели", "Виртуализация и Cloud Computing", "Въведение в генетиката", "Географски информационни системи", "Геометрия и топология", "Геометрия на движението", "Граматики за генеративно изкуство", "Дескриптивна геометрия", "Дизайн и анализ на алгоритми", "Дизайн и анализ на алгоритми - практикум", "Динамични геометрични системи", "Динамични системи", "Директорийни услуги", "Дискретна оптимизация", "Диференциални уравнения и приложения с \"Mathematica\", \"Matlab\" или \"Maple\" ", "Диференциални уравнения ", "Допълнение към курса по ДИС за компютърни специалности", "Е-бизнес: стратегия, архитектура, проектиране", "Език за програмиране C#", "Езикова култура", "Езици за системно програмиране", "Езици и среди за обучение", "Езици, автомати и изчислимост", "Екология и опазване на околната среда", "Експериментални методи в механиката с практикум I", "Електронно обучение", "Елементи от алгебричната геометрия", "Елементи от теория на информацията", "Избрани теми от биоматематиката", "Извличане на знания от данни", "Извличане на информация", "Изкуствен интелект", "Изомонодромна деформация на линейни ОДУ с коефициенти рационални функции", "Изпъкналост и диференцируемост в Банахови пространства", "Изчислимост и сложност", "Изчислителна геометрия", "Информационните технологии в обучението на деца със специални образователни потребности", "Комбинаторика, вероятности и статистика в училищния курс по математика", "Комплексен анализ", "Компютърна графика", "Компютърни архитектури - практикум", "Компютърни мрежи", "Компютърни мрежи (CCNA) - практикум ", "Компютърно геометрично моделиране", "Конкурентно програмиране", "Коректно поставени задачи за еволюционни уравнения и системи", "Линейни диференциални оператори", "Линейни модели с R                                   ", "Линукс системно администриране", "Логическо програмиране", "Мatlab и приложения в числените методи", "Макроикономика", "Математическа екология", "Математическа логика", "Математическа статистика", "Математическа текстообработка", "Математически методи в педагогическата диагностика", "Математически модели във физиката", "Математически модели и изчислителен експеримент", "Математически увод в икономиката", "Метод на крайните елементи - алгоритмични основи", "Методи за оптимизация", "Механика на флуидите", "Многоплатформени мобилни приложения", "Модели в социалните науки", "Модели за управление на качеството", "Модели на смъртност", "Мрежова сигурност", "Небесна механика", "Обектно-ориентирано програмиране с JAVA", "Обектно-ориентирано програмиране със C#.NET", "Обща топология", "Операционни системи и офис приложения - практикум", "Оптимално управление", "Оптимизационна теория на графите", "Основи на TCP/IP (в. 4 и в. 6)", "Основи на статистическата обработка на естествен език", "Паралелни алгоритми", "Педагогически функции на интерактивна бяла дъска", "Понятия  и структури в езиците за програмиране", "Практическо програмиране с Perl", "ПРЕДПРИЕМАЧЕСТВО „Учебна компания (програма на „Джуниър Ачийвмънт)", "Представяния на компактни групи на Ли", "Преобразование на Фурие и Уейвлети-приложение в обработката на сигнали", "Приложение на групите на Ли в диференциалните уравнения", "Приложения на крайните автомати", "Програмиране 101", "Програмиране за ОС Android", "Програмиране с Objective-C", "Програмиране с Ruby on Rails", "Програмиране  за iOS", "Проектиране на Java сървърни приложения", "Проектиране, разработка и оценка на образователен софтуер", "Разклоняващи се процеси ", "Размити множества и приложения", "Разработване на ИКТ - базирано обучение", "Риманова геометрия, избрани приложения, метод на Бохнер и теореми за анулиране", "Руски език за начинаещи", "Семантика на езиците за програмиране", "Семинар Допълнителни въпроси от ДИС", "Семинар по Динамични системи и теория на числата - 2", "Семинар по Динамични системи и теория на числата-1", "Семинар по Диференциални уравнения", "Семинар по компютърна алгебра, ортогонални полиноми и специални функции", "Семинар по Проектиране и интегриране на софтуерни системи", "Семинар по функционален анализ", "Системи за управление на бази от данни (практикум) - спец. ИС", "Системно програмиране на C за Linux", "Случайни процеси", "Соболеви пространства и приложения в ЧДУ", "СОТ (Съвременни образователни технологии)", "Софтуерни шаблони за проектиране", "Специфични въпроси в обучението по информационни технологии", "Сплайн-функции и приложения", "Спорт****", "Статистическа лаборатория (семинар)", "Статистически методи в БДС", "Структури върху гладки многообразия", "Структури от данни - практикум - спец. ИС", "Структури от данни и програмиране - практикум - спец. M", "Структури от данни и програмиране - практикум - спец. И", "Структури от данни и програмиране -практикум - спец. КН                                    ", "Съвременни комуникации", "Съвременни методи за многомерни апроксимации и геометрично моделиране", "Съвременно уеб-програмиране с РНР", "Съдържание и методика на извънкласната работа по математика", "Състезания по математика за студенти - 1 част", "Състезания по математика за студенти - 2 част", "Теория на апроксимациите", "Теория на вероятностите 2", "Теория на вероятностите и математическа статистика", "Теория на Галоа", "Теория на диференчните схеми", "Теория на екстремалните задачи", "Теория на игрите", "Теория на множествата", "Теория на мярката и интеграла (Интеграл на Лебег)", "Теория на нелинейните системи", "Теория на полугрупите и приложения", "Теория на разпределенията и трансформация на Фурие - спец. И, М, ПМ", "Теория на солитоните", "Технолигиите в помощ на образователни проекти", "Топология за информатици", "Убеждаваща комуникация и диалог", "Увод в актюерството", "Увод в аналитичната теория на числата", "Увод в комутативната алгебра", "Увод в програмирането - практикум", "Увод в статистиката", "Увод в съвременната теория на Частните диференциални уравнения", "Увод в състезателното програмиране***", "Увод в теория на графите (екстрeмални задачи)", "Увод в теорията на динамичните системи и хаоса", "Увод във времеви редове", "Увод във функционалния анализ", "Уеб приложения с ASP.NET MVC", "Управление на знания", "Управление на знания", "Устройство на компютърните системи", "Учебен семинар по Частни диференциални уравнения", "Учебна документация", "Факторни планове", "Философия на математиката", "Философия на математиката", "Финансови модели с шокови влияния на пазара   ", "Фрактали", "Френски език за начинаещи", "Функционален анализ", "Функционални пространства и теория на интерполацията", "Функционално програмиране - практикум", "Функционално програмиране ", "Хамилтонови системи", "Числени методи за диференциални уравнения - практикум", "Числени методи за диференциални уравнения ", "Числени методи за системи с разредени матрици", "Числено интегриране", "Visual basic за приложения", " " }));

        add.setText("Добави");
        add.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addMouseClicked(evt);
            }
        });
        add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addActionPerformed(evt);
            }
        });

        grade.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "3", "4", "5", "6" }));

        tableSubject.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "Предмет"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tableSubject);

        tableGrade.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "Оценка"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tableGrade);

        jLabel1.setText("Предмет:");

        jLabel2.setText("Оценка:");

        jLabel3.setText("Резултат:");

        suggest.setText("Предложи");
        suggest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                suggestActionPerformed(evt);
            }
        });

        tableSuggested.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null}
            },
            new String [] {
                "Магистърска Програма"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane4.setViewportView(tableSuggested);
        tableSuggested.getColumnModel().getColumn(0).setResizable(false);
        tableSuggested.getAccessibleContext().setAccessibleName("resultTable");

        delete.setText("Изтрий");
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });

        jLabel4.setText("Изтрий предмет:");

        delSubjectNum.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", " " }));

        tableNumber.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "№"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(tableNumber);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(97, 97, 97)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 569, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(subject, 0, 0, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel3))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                        .addGap(43, 43, 43)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(suggest, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(grade, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2)
                                    .addComponent(delSubjectNum, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(delete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(add, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE))))))
                .addGap(115, 115, 115))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(add, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(grade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(subject))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(delete)
                    .addComponent(jLabel4)
                    .addComponent(delSubjectNum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 267, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(suggest)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(105, 105, 105))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void refresh()
    {
       int j;
       for(j = 0; j < 15; j++)
       {
         this.tableGrade.setValueAt("", j, 0); 
         this.tableSubject.setValueAt("", j, 0);
         this.tableNumber.setValueAt("", j, 0);
       }
       
       for(j = 0; j < vec.size();j++)
       {
            this.tableSubject.setValueAt(vec.elementAt(j).getL(), j, 0);
            this.tableGrade.setValueAt(vec.elementAt(j).getR(), j, 0);
            this.tableNumber.setValueAt(j+1, j, 0);
       }

    }
    private void addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addActionPerformed
       String str = (String)this.subject.getSelectedItem();
       int gr = Integer.parseInt((String)this.grade.getSelectedItem());
       
       Algorithm.Pair<String,Integer> p1 = alg.new Pair(str,gr);
       vec.add(p1);
       refresh();     
    }//GEN-LAST:event_addActionPerformed

    private void addMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addMouseClicked
      
    }//GEN-LAST:event_addMouseClicked

    private void suggestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_suggestActionPerformed
        
        AI_Project ai = new AI_Project(); 
       
        int j;
        for(j = 0 ; j < i; j++)
        {       
            String str = (String)tableSubject.getValueAt(j, 0);
            int gr = Integer.parseInt((String)tableGrade.getValueAt(j, 0));
            Algorithm.Pair<String,Integer> p1 = alg.new Pair(str,gr);
            vec.add(p1);
        }
        
        Pair<String, Float> p = ai.giveAndGet(vec);
        
        this.tableSuggested.setValueAt(p.getL(),0,0);
        
        
        
    }//GEN-LAST:event_suggestActionPerformed

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
      int j = Integer.parseInt((String)this.delSubjectNum.getSelectedItem());
      vec.removeElementAt(j-1);
      
      refresh();
          }//GEN-LAST:event_deleteActionPerformed
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add;
    private javax.swing.JComboBox delSubjectNum;
    private javax.swing.JButton delete;
    private javax.swing.JComboBox grade;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JComboBox subject;
    private javax.swing.JButton suggest;
    private javax.swing.JTable tableGrade;
    private javax.swing.JTable tableNumber;
    private javax.swing.JTable tableSubject;
    private javax.swing.JTable tableSuggested;
    // End of variables declaration//GEN-END:variables
}
