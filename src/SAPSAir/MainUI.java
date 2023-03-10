package SAPSAir;

import java.awt.Color;
import java.awt.Toolkit;
import java.util.ArrayList;
import javax.swing.DefaultListModel;

public class MainUI extends javax.swing.JFrame {
    
    public MainUI() {
		//Initialize UI and its components
        initComponents();
		
		//Setting icon for the program from the imported project resource
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().
		getResource("airplane.png")));
		
		//Setting background color of the form pane
        getContentPane().setBackground(new Color(255, 255, 255));
    }
    
	//The list of all PatientInfo classes to store a collection of data
	//We are gonna use this array list as our database/data source for the program
    ArrayList<PassengerInfo> passengerDatabase = new ArrayList<>();
    ArrayList<FlightInfo> flightDatabase = new ArrayList<>();
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        bookedList = new javax.swing.JList<>();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        __ID = new javax.swing.JTextField();
        __name = new javax.swing.JTextField();
        __passengerName = new javax.swing.JTextField();
        __bookDate = new javax.swing.JTextField();
        __flightDate = new javax.swing.JTextField();
        __phoneNumber = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        __email = new javax.swing.JTextField();
        bookFlightBtn = new javax.swing.JButton();
        jLabel34 = new javax.swing.JLabel();
        unbookFlightBtn = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        flightList = new javax.swing.JList<>();
        jLabel10 = new javax.swing.JLabel();
        id__ = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        name__ = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        price__ = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        date__ = new javax.swing.JTextField();
        addFlightBtn = new javax.swing.JButton();
        removeFlightBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SAPS Air");
        setBackground(new java.awt.Color(20, 20, 20));
        setLocationByPlatform(true);
        setMaximizedBounds(new java.awt.Rectangle(890, 890, 890, 890));
        setMaximumSize(new java.awt.Dimension(890, 890));
        setPreferredSize(new java.awt.Dimension(890, 890));
        setResizable(false);
        setSize(new java.awt.Dimension(890, 890));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Microsoft YaHei UI Light", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 153));
        jLabel1.setText("SAPS Air");

        jLabel2.setFont(new java.awt.Font("Microsoft YaHei UI Light", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(50, 50, 50));
        jLabel2.setText("Let's take off");

        jLabel3.setFont(new java.awt.Font("Microsoft YaHei Light", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(70, 70, 70));
        jLabel3.setText("Book/Unbook flights");

        bookedList.setBackground(new java.awt.Color(255, 255, 255));
        bookedList.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 0, 12)); // NOI18N
        bookedList.setForeground(new java.awt.Color(255, 0, 153));
        bookedList.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane2.setViewportView(bookedList);

        jPanel1.setBackground(new java.awt.Color(255, 0, 102));
        jPanel1.setPreferredSize(new java.awt.Dimension(0, 1));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1, Short.MAX_VALUE)
        );

        jLabel4.setFont(new java.awt.Font("Microsoft YaHei Light", 0, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Flight ID");

        jLabel5.setFont(new java.awt.Font("Microsoft YaHei Light", 0, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Flight Name");

        jLabel6.setFont(new java.awt.Font("Microsoft YaHei Light", 0, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Passenger Name");

        jLabel7.setFont(new java.awt.Font("Microsoft YaHei Light", 0, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Book Date");

        jLabel8.setFont(new java.awt.Font("Microsoft YaHei Light", 0, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Phone no.");

        jLabel11.setFont(new java.awt.Font("Microsoft YaHei Light", 0, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 0));
        jLabel11.setText("Flight Date");

        __ID.setBackground(new java.awt.Color(255, 255, 255));
        __ID.setFont(new java.awt.Font("Microsoft YaHei Light", 0, 10)); // NOI18N
        __ID.setForeground(new java.awt.Color(0, 0, 0));

        __name.setBackground(new java.awt.Color(255, 255, 255));
        __name.setFont(new java.awt.Font("Microsoft YaHei Light", 0, 10)); // NOI18N
        __name.setForeground(new java.awt.Color(0, 0, 0));

        __passengerName.setBackground(new java.awt.Color(255, 255, 255));
        __passengerName.setFont(new java.awt.Font("Microsoft YaHei Light", 0, 10)); // NOI18N
        __passengerName.setForeground(new java.awt.Color(0, 0, 0));

        __bookDate.setBackground(new java.awt.Color(255, 255, 255));
        __bookDate.setFont(new java.awt.Font("Microsoft YaHei Light", 0, 10)); // NOI18N
        __bookDate.setForeground(new java.awt.Color(0, 0, 0));

        __flightDate.setBackground(new java.awt.Color(255, 255, 255));
        __flightDate.setFont(new java.awt.Font("Microsoft YaHei Light", 0, 10)); // NOI18N
        __flightDate.setForeground(new java.awt.Color(0, 0, 0));

        __phoneNumber.setBackground(new java.awt.Color(255, 255, 255));
        __phoneNumber.setFont(new java.awt.Font("Microsoft YaHei Light", 0, 10)); // NOI18N
        __phoneNumber.setForeground(new java.awt.Color(0, 0, 0));

        jLabel13.setFont(new java.awt.Font("Microsoft YaHei Light", 0, 12)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 0, 0));
        jLabel13.setText("Email");

        __email.setBackground(new java.awt.Color(255, 255, 255));
        __email.setFont(new java.awt.Font("Microsoft YaHei Light", 0, 10)); // NOI18N
        __email.setForeground(new java.awt.Color(0, 0, 0));

        bookFlightBtn.setBackground(new java.awt.Color(255, 255, 255));
        bookFlightBtn.setFont(new java.awt.Font("Microsoft YaHei UI Light", 0, 14)); // NOI18N
        bookFlightBtn.setForeground(new java.awt.Color(255, 0, 153));
        bookFlightBtn.setText("Book Flight");
        bookFlightBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bookFlightBtnActionPerformed(evt);
            }
        });

        jLabel34.setFont(new java.awt.Font("Microsoft YaHei UI Light", 0, 14)); // NOI18N
        jLabel34.setForeground(new java.awt.Color(70, 70, 70));
        jLabel34.setText("Add/remove Flights");

        unbookFlightBtn.setBackground(new java.awt.Color(255, 255, 255));
        unbookFlightBtn.setFont(new java.awt.Font("Microsoft YaHei UI Light", 0, 14)); // NOI18N
        unbookFlightBtn.setForeground(new java.awt.Color(255, 0, 153));
        unbookFlightBtn.setText("Unbook Flight");
        unbookFlightBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                unbookFlightBtnActionPerformed(evt);
            }
        });

        flightList.setBackground(new java.awt.Color(255, 255, 255));
        flightList.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 0, 12)); // NOI18N
        flightList.setForeground(new java.awt.Color(255, 0, 102));
        flightList.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane3.setViewportView(flightList);

        jLabel10.setFont(new java.awt.Font("Microsoft YaHei Light", 0, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("Flight ID");

        id__.setBackground(new java.awt.Color(255, 255, 255));
        id__.setFont(new java.awt.Font("Microsoft YaHei Light", 0, 10)); // NOI18N
        id__.setForeground(new java.awt.Color(0, 0, 0));

        jLabel12.setFont(new java.awt.Font("Microsoft YaHei Light", 0, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 0, 0));
        jLabel12.setText("Flight Name");

        name__.setBackground(new java.awt.Color(255, 255, 255));
        name__.setFont(new java.awt.Font("Microsoft YaHei Light", 0, 10)); // NOI18N
        name__.setForeground(new java.awt.Color(0, 0, 0));

        jLabel14.setFont(new java.awt.Font("Microsoft YaHei Light", 0, 12)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 0, 0));
        jLabel14.setText("Flight Price");

        price__.setBackground(new java.awt.Color(255, 255, 255));
        price__.setFont(new java.awt.Font("Microsoft YaHei Light", 0, 10)); // NOI18N
        price__.setForeground(new java.awt.Color(0, 0, 0));

        jLabel15.setFont(new java.awt.Font("Microsoft YaHei Light", 0, 12)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 0, 0));
        jLabel15.setText("Flight Date");

        date__.setBackground(new java.awt.Color(255, 255, 255));
        date__.setFont(new java.awt.Font("Microsoft YaHei Light", 0, 10)); // NOI18N
        date__.setForeground(new java.awt.Color(0, 0, 0));

        addFlightBtn.setBackground(new java.awt.Color(255, 255, 255));
        addFlightBtn.setFont(new java.awt.Font("Microsoft YaHei UI Light", 0, 14)); // NOI18N
        addFlightBtn.setForeground(new java.awt.Color(255, 0, 153));
        addFlightBtn.setText("Add flight");
        addFlightBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addFlightBtnActionPerformed(evt);
            }
        });

        removeFlightBtn.setBackground(new java.awt.Color(255, 255, 255));
        removeFlightBtn.setFont(new java.awt.Font("Microsoft YaHei UI Light", 0, 14)); // NOI18N
        removeFlightBtn.setForeground(new java.awt.Color(255, 0, 153));
        removeFlightBtn.setText("Remove flight");
        removeFlightBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeFlightBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel2))
                            .addComponent(jLabel3))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel34)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 794, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 214, Short.MAX_VALUE)
                                    .addComponent(unbookFlightBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(13, 13, 13)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(0, 0, Short.MAX_VALUE)
                                                .addComponent(bookFlightBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel8)
                                                    .addComponent(jLabel11)
                                                    .addComponent(jLabel7)
                                                    .addComponent(jLabel6))
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addGap(63, 63, 63)
                                                        .addComponent(__phoneNumber))
                                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                        .addGap(64, 64, 64)
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                            .addComponent(__flightDate, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 411, Short.MAX_VALUE)
                                                            .addComponent(__bookDate, javax.swing.GroupLayout.Alignment.TRAILING)
                                                            .addComponent(__passengerName)))))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel5)
                                                    .addComponent(jLabel4))
                                                .addGap(89, 89, 89)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(__ID)
                                                    .addComponent(__name)))))
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel13)
                                        .addGap(127, 127, 127)
                                        .addComponent(__email)))))
                        .addGap(30, 30, 30))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(removeFlightBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 210, Short.MAX_VALUE)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel12)
                                            .addComponent(jLabel10))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(id__)
                                            .addComponent(name__)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel14)
                                            .addComponent(jLabel15))
                                        .addGap(26, 26, 26)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(price__, javax.swing.GroupLayout.DEFAULT_SIZE, 461, Short.MAX_VALUE)
                                            .addComponent(date__))))
                                .addContainerGap())
                            .addComponent(addFlightBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(27, 27, 27)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(__ID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(__name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(__passengerName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(__bookDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(__flightDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(__phoneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(__email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(48, 48, 48)
                        .addComponent(bookFlightBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(unbookFlightBtn)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel34, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(id__, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(name__, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(price__, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(date__, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(addFlightBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(removeFlightBtn)
                .addContainerGap(37, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

	//event when the window is opened
    private void formWindowOpened(java.awt.event.WindowEvent evt) {
		//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        
	//Adding some example data (as default data) for tests
        passengerDatabase.add(new PassengerInfo(1, "The AIRLines", "Darsh",
		"10/1/2023", "2/2/2023", "8567492746", "Darsh@gmail.com"));
        passengerDatabase.add(new PassengerInfo(2, "The AIRLines 2", "Ayush 2",
		"11/1/2023", "3/2/2023", "8567492748", "Darsh2g@gmail.com"));
        passengerDatabase.add(new PassengerInfo(3, "The AIRLines 3", "Ayush 3",
		"12/1/2023", "4/2/2023", "8567492749", "Darsh3g@gmail.com"));
        passengerDatabase.add(new PassengerInfo(4, "The AIRLines 4", "Ayush 4",
		"13/1/2023", "5/2/2023", "8567492740", "Darsh4g@gmail.com"));
        
        flightDatabase.add(new FlightInfo(1, "The AIRLines", 20000, "2/2/2023"));
        flightDatabase.add(new FlightInfo(2, "The AIRLines 2", 30000, "3/2/2023"));
        flightDatabase.add(new FlightInfo(3, "The AIRLines 3", 40000, "4/2/2023"));
        flightDatabase.add(new FlightInfo(4, "The AIRLines 4", 50000, "5/2/2023"));
        
	//Calling the custom method to load the data from our database variable to UI JList
        LoadDatabaseToUI();
		
    }//GEN-LAST:event_formWindowOpened

	//Event when user pressed the Update button
    private void unbookFlightBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_unbookFlightBtnActionPerformed
        // TODO add your handling code here:
        
	//a Try-Cache to avoid throwing exceptions for anything
        try
        {
			
            passengerDatabase.remove(bookedList.getSelectedIndex());
        
            LoadDatabaseToUI();
        }
        catch(Exception ec)
        {
        
        }
        
    }//GEN-LAST:event_unbookFlightBtnActionPerformed

    private void bookFlightBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bookFlightBtnActionPerformed
        // TODO add your handling code here:
        try
        {
            PassengerInfo p = new PassengerInfo(Integer.parseInt(__ID.getText()), __name.getText(), __passengerName.getText(), __bookDate.getText(), __flightDate.getText(), __phoneNumber.getText(), __email.getText());
        
            passengerDatabase.add(p);
            
            __ID.setText("");
            __name.setText("");
            __passengerName.setText("");
            __bookDate.setText("");
            __flightDate.setText("");
            __phoneNumber.setText("");
            __email.setText("");
            
            LoadDatabaseToUI();
        }
        catch(Exception ec)
        {
        
        }
    }//GEN-LAST:event_bookFlightBtnActionPerformed

    private void removeFlightBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeFlightBtnActionPerformed
        // TODO add your handling code here:
        //a Try-Cache to avoid throwing exceptions for anything
        try
        {
			
            flightDatabase.remove(flightList.getSelectedIndex());
        
            LoadDatabaseToUI();
        }
        catch(Exception ec)
        {
        
        }
    }//GEN-LAST:event_removeFlightBtnActionPerformed

    private void addFlightBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addFlightBtnActionPerformed
        // TODO add your handling code here:
        try
        {
            FlightInfo p = new FlightInfo(Integer.parseInt(id__.getText()), name__.getText(), Integer.parseInt(price__.getText()), date__.getText());
        
            flightDatabase.add(p);
            
            id__.setText("");
            name__.setText("");
            price__.setText("");
            date__.setText("");
            
            LoadDatabaseToUI();
        }
        catch(Exception ec)
        {
        
        }
    }//GEN-LAST:event_addFlightBtnActionPerformed
    
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
            javax.swing.UIManager.LookAndFeelInfo[] installedLookAndFeels=javax.swing.UIManager.getInstalledLookAndFeels();
            for (int idx=0; idx<installedLookAndFeels.length; idx++)
                if ("Nimbus".equals(installedLookAndFeels[idx].getName())) {
                    javax.swing.UIManager.setLookAndFeel(installedLookAndFeels[idx].getClassName());
                    break;
                }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainUI().setVisible(true);
            }
        });
        
    }
    
	//Our custom method to load all data from the database to UI JList
    public void LoadDatabaseToUI()
    {
	//clearning the JList
        bookedList.removeAll();
        flightList.removeAll();
		
	//Declaring a new List Model to set in JList
        DefaultListModel values1 = new DefaultListModel();
        DefaultListModel values2 = new DefaultListModel();
		
	//Iterating through all elements of the database
        for(int i=0; i<passengerDatabase.size(); i++)
        {
            //Adding the names each Patient name from the currrent database
            values1.addElement(passengerDatabase.get(i).PassengerName);
        }
        for(int i=0; i<flightDatabase.size(); i++)
        {
            //Adding the names each Patient name from the currrent database
            values2.addElement(flightDatabase.get(i).Name);
        }
		
	//Setting our declared model to the JList to show in UI
        bookedList.setModel(values1);
        flightList.setModel(values2);
    }
    
    //Our custom class to store managed data into
    public class PassengerInfo {
        public int FlightID;
        public String FlightName;
        public String PassengerName;
        public String BookDate;
        public String FlightDate;
        public String PhoneNumber;
        public String Email;
        
        PassengerInfo(int _flightid, String _flightname, String _passengername, 
		String _bookdate, String _flightdate, String _phoneNumber, 
		String _email)
        {
            FlightID = _flightid;
            FlightName = _flightname;
            PassengerName = _passengername;
            BookDate = _bookdate;
            FlightDate = _flightdate;
            PhoneNumber = _phoneNumber;
            Email = _email;
        }
    }
    
    public class FlightInfo {
        public int ID;
        public String Name;
        public int Price;
        public String Date;
        
        FlightInfo(int _flightid, String _flightname, int _flightprice, String _flightdate)
        {
            ID = _flightid;
            Name = _flightname;
            Price = _flightprice;
            Date = _flightdate;
        }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField __ID;
    private javax.swing.JTextField __bookDate;
    private javax.swing.JTextField __email;
    private javax.swing.JTextField __flightDate;
    private javax.swing.JTextField __name;
    private javax.swing.JTextField __passengerName;
    private javax.swing.JTextField __phoneNumber;
    private javax.swing.JButton addFlightBtn;
    private javax.swing.JButton bookFlightBtn;
    private javax.swing.JList<String> bookedList;
    private javax.swing.JTextField date__;
    private javax.swing.JList<String> flightList;
    private javax.swing.JTextField id__;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextField name__;
    private javax.swing.JTextField price__;
    private javax.swing.JButton removeFlightBtn;
    private javax.swing.JButton unbookFlightBtn;
    // End of variables declaration//GEN-END:variables
    
}