package com.example.dothanh.calculartor;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener, View.OnLongClickListener {

    String hienThi = "", ketQua = "", pheptinh1 = "", pheptinh2 = "", temp = "";
    boolean trangthai;
    double luuso1, luuso2;
    TextView txtketqua, txthienthi;
    Button btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btn0, btncong, btntru, btnnhan,
            btnchia, btnbang, btnac, btndauam, btnphantram, btnphay;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txthienthi = (TextView) findViewById(R.id.txt_HienThi);
        txtketqua = (TextView) findViewById(R.id.txt_KetQua);

        btn0 = (Button) findViewById(R.id.btn0);
        btn0.setOnClickListener(this);

        btn1 = (Button) findViewById(R.id.btn1);
        btn1.setOnClickListener(this);

        btn2 = (Button) findViewById(R.id.btn2);
        btn2.setOnClickListener(this);

        btn3 = (Button) findViewById(R.id.btn3);
        btn3.setOnClickListener(this);

        btn4 = (Button) findViewById(R.id.btn4);
        btn4.setOnClickListener(this);

        btn5 = (Button) findViewById(R.id.btn5);
        btn5.setOnClickListener(this);

        btn6 = (Button) findViewById(R.id.btn6);
        btn6.setOnClickListener(this);

        btn7 = (Button) findViewById(R.id.btn7);
        btn7.setOnClickListener(this);

        btn8 = (Button) findViewById(R.id.btn8);
        btn8.setOnClickListener(this);

        btn9 = (Button) findViewById(R.id.btn9);
        btn9.setOnClickListener(this);

        btncong = (Button) findViewById(R.id.btn_daucong);
        btncong.setOnClickListener(this);

        btntru = (Button) findViewById(R.id.btn_dautru);
        btntru.setOnClickListener(this);

        btnnhan = (Button) findViewById(R.id.btn_daunhan);
        btnnhan.setOnClickListener(this);

        btnchia = (Button) findViewById(R.id.btn_dauchia);
        btnchia.setOnClickListener(this);

        btnac = (Button) findViewById(R.id.btn_AC);
        btnac.setOnClickListener(this);

        btnphantram = (Button) findViewById(R.id.btn_dauphantram);
        btnphantram.setOnClickListener(this);

        btndauam = (Button) findViewById(R.id.btn_congtru);
        btndauam.setOnClickListener(this);

        btnphay = (Button) findViewById(R.id.btn_dauphay);
        btnphay.setOnClickListener(this);

        btnbang = (Button) findViewById(R.id.btn_daubang);
        btnbang.setOnClickListener(this);
    }

    public double tinhtoan() {
        switch (pheptinh1) {
            case "+":
                luuso1 = luuso1 + luuso2;
                ketQua = luuso1 + "";
                break;
            case "-":
                luuso1 = luuso1 - luuso2;
                ketQua = luuso1 + "";
                break;
            case "x":
                luuso1 = luuso1 * luuso2;
                ketQua = luuso1 + "";
                break;
            case "/":
//                if (luuso2 == 0) {
//                    ketQua = "Không thực hiên được";
//                    luuso1 = luuso2 = 0;
//                    pheptinh1 = pheptinh2 = "";
//                    trangthai = false;
//                }
//                else {
                luuso1 = luuso1 / luuso2;
                ketQua = luuso1 + "";
//                }
                break;
        }
        return luuso1;
    }

    @Override
    public void onClick(View v) {
        int id = v.getId();
        if (id == R.id.btn1) {
            if (trangthai == false) {
                hienThi = "";
                ketQua = "";
                luuso1 = luuso2 = 0;
                temp = "";
                trangthai = true;
            }
            if (ketQua.equals("Không thực hiện được")) {
                hienThi = "1";
                temp = "1";
            } else {
                hienThi += "1";
                temp += "1";
            }
            txthienthi.setText(hienThi);
        }

        if (id == R.id.btn2) {
            if (trangthai == false) {
                hienThi = "";
                ketQua = "";
                luuso1 = luuso2 = 0;
                temp = "";
                trangthai = true;
            }
            if (ketQua.equals("Không thực hiện được")) {
                hienThi = "2";
                temp = "2";
            } else {
                hienThi += "2";
                temp += "2";
            }
            txthienthi.setText(hienThi);
        }

        if (id == R.id.btn3) {
            if (trangthai == false) {
                hienThi = "";
                ketQua = "";
                luuso1 = luuso2 = 0;
                temp = "";
                trangthai = true;
            }
            if (ketQua.equals("Không thực hiện được")) {
                hienThi = "3";
                temp = "3";
            } else {
                hienThi += "3";
                temp += "3";
            }
            txthienthi.setText(hienThi);
        }

        if (id == R.id.btn4) {
            if (trangthai == false) {
                hienThi = "";
                ketQua = "";
                luuso1 = luuso2 = 0;
                temp = "";
                trangthai = true;
            }
            if (ketQua.equals("Không thực hiện được")) {
                hienThi = "4";
                temp = "4";
            } else {
                hienThi += "4";
                temp += "4";
            }
            txthienthi.setText(hienThi);
        }

        if (id == R.id.btn5) {
            if (trangthai == false) {
                hienThi = "";
                ketQua = "";
                luuso1 = luuso2 = 0;
                temp = "";
                trangthai = true;
            }
            if (ketQua.equals("Không thực hiện được")) {
                hienThi = "5";
                temp = "5";
            } else {
                hienThi += "5";
                temp += "5";
            }
            txthienthi.setText(hienThi);
        }

        if (id == R.id.btn6) {
            if (trangthai == false) {
                hienThi = "";
                ketQua = "";
                luuso1 = luuso2 = 0;
                temp = "";
                trangthai = true;
            }
            if (ketQua.equals("Không thực hiện được")) {
                hienThi = "6";
                temp = "6";
            } else {
                hienThi += "6";
                temp += "6";
            }
            txthienthi.setText(hienThi);
        }

        if (id == R.id.btn7) {
            if (trangthai == false) {
                hienThi = "";
                ketQua = "";
                luuso1 = luuso2 = 0;
                temp = "";
                trangthai = true;
            }
            if (ketQua.equals("Không thực hiện được")) {
                hienThi = "7";
                temp = "7";
            } else {
                hienThi += "7";
                temp += "7";
            }
            txthienthi.setText(hienThi);
        }
        if (id == R.id.btn8) {
            if (trangthai == false) {
                hienThi = "";
                ketQua = "";
                luuso1 = luuso2 = 0;
                temp = "";
                trangthai = true;
            }
            if (ketQua.equals("Không thực hiện được")) {
                hienThi = "8";
                temp = "8";
            } else {
                hienThi += "8";
                temp += "8";
            }
            txthienthi.setText(hienThi);
        }

        if (id == R.id.btn9) {
            if (trangthai == false) {
                hienThi = "";
                ketQua = "";
                luuso1 = luuso2 = 0;
                temp = "";
                trangthai = true;
            }
            if (ketQua.equals("Không thực hiện được")) {
                hienThi = "9";
                temp = "9";
            } else {
                hienThi += "9";
                temp += "9";
            }
            txthienthi.setText(hienThi);
        }

        if (id == R.id.btn0) {
            if (trangthai == false) {
                hienThi = "";
                ketQua = "";
                luuso1 = luuso2 = 0;
                temp = "";
                trangthai = true;
            }
            if (ketQua.equals("Không thực hiện được")) {
                hienThi = "0";
                temp = "0";
            } else {
                hienThi += "0";
                temp += "0";
            }
            txthienthi.setText(hienThi);
        }
        if (id == R.id.btn_daucong) {
            pheptinh2 = "+";
            if (trangthai == false) {
                hienThi = luuso1 + "";
                ketQua = luuso1 + "";
                pheptinh1 = "";
            } else if (pheptinh1 == "" && trangthai == true) {
                luuso1 = Double.parseDouble(temp);
                ketQua = luuso1 + "";
            } else if (pheptinh1 != "" && trangthai == true && temp != "") {
                luuso2 = Double.parseDouble(temp);
                luuso1 = tinhtoan();
                ketQua = luuso1 + "";
            } else if (pheptinh1 != "" && trangthai == true && temp == "") {
                pheptinh1 = "";
                hienThi = hienThi.substring(0, hienThi.length() - 3);
            }
            pheptinh1 = pheptinh2;
            hienThi = hienThi + " + ";
            temp = "";
            trangthai = true;
            txthienthi.setText(hienThi);
            txtketqua.setText(ketQua);
        }

        if (id == R.id.btn_daubang) {
            if (trangthai == true && pheptinh1 == "") {
                luuso1 = Double.parseDouble(temp);
                ketQua = luuso1 + "";
            } else if (trangthai == true && temp != "") {
                luuso2 = Double.parseDouble(temp);
                luuso1 = tinhtoan();
                ketQua = luuso1 + "";
                temp = "";
            } else if (temp == "") {
                hienThi = luuso1 + "";
                ketQua = luuso1 + "";
            }
            trangthai = false;
            txthienthi.setText(hienThi);
            txtketqua.setText(ketQua);
        }
        if (id == R.id.btn_dautru) {
            pheptinh2 = "-";
            if (trangthai == false) {
                hienThi = luuso1 + "";
                ketQua = luuso1 + "";
                pheptinh1 = null;
            } else if (pheptinh1 == "" && trangthai == true) {
                luuso1 = Double.parseDouble(temp);
                ketQua = luuso1 + "";
            } else if (pheptinh1 != null && trangthai == true && temp != "") {
                luuso2 = Double.parseDouble(temp);
                luuso1 = tinhtoan();
                ketQua = luuso1 + "";
            } else if (pheptinh1 != "" && trangthai == true && temp == "") {
                pheptinh1 = "";
                hienThi = hienThi.substring(0, hienThi.length() - 3);
            }
            pheptinh1 = pheptinh2;
            hienThi = hienThi + " - ";
            temp = "";
            trangthai = true;
            txthienthi.setText(hienThi);
            txtketqua.setText(ketQua);
        }
        if (id == R.id.btn_daunhan) {
            pheptinh2 = "x";
            if (trangthai == false) {
                hienThi = luuso1 + "";
                ketQua = luuso1 + "";
                trangthai = true;
            } else if (pheptinh1 == "" && trangthai == true) {
                luuso1 = Double.parseDouble(temp);
                pheptinh1 = pheptinh2;
                ketQua = luuso1 + "";
            } else if ((pheptinh1 == "x" || pheptinh1 == "/") && trangthai == true && temp != "") {
                luuso2 = Double.parseDouble(temp);
                luuso1 = tinhtoan();
                ketQua = luuso1 + "";
            } else if ((pheptinh1 == "+" || pheptinh1 == "-") && trangthai == true && temp != "") {
                luuso2 = Double.parseDouble(temp);
                luuso1 = tinhtoan();
                hienThi = luuso1 + "";
            } else if (pheptinh1 != "" && trangthai == true && temp == "") {
                pheptinh1 = "";
                hienThi = hienThi.substring(0, hienThi.length() - 3);
            }
            hienThi += " x ";
            pheptinh1 = pheptinh2;
            temp = "";
            trangthai = true;
            txthienthi.setText(hienThi);
            txtketqua.setText(ketQua);
        }
        if (id == R.id.btn_dauchia) {
            pheptinh2 = "/";
            if (temp == "0") {
                ketQua = "Không thực hiên được";
                luuso1 = luuso2 = 0;
                pheptinh1 = pheptinh2 = "";
                trangthai = false;
            } else if (trangthai == false) {
                hienThi = luuso1 + "";
                ketQua = luuso1 + "";
                trangthai = true;
            } else if (pheptinh1 == "" && trangthai == true) {
                luuso1 = Double.parseDouble(temp);
                pheptinh1 = pheptinh2;
                ketQua = luuso1 + "";
            } else if ((pheptinh1 == "x" || pheptinh1 == "/") && trangthai == true && temp != "") {
                luuso2 = Double.parseDouble(temp);
                luuso1 = tinhtoan();
                ketQua = luuso1 + "";
            } else if ((pheptinh1 == "+" || pheptinh1 == "-") && trangthai == true && temp != "") {
                luuso2 = Double.parseDouble(temp);
                luuso1 = tinhtoan();
                hienThi = luuso1 + "";
            } else if (pheptinh1 != "" && trangthai == true && temp == "") {
                pheptinh1 = "";
                hienThi = hienThi.substring(0, hienThi.length() - 3);
            }
            hienThi += " ÷ ";
            pheptinh1 = pheptinh2;
            temp = "";
            trangthai = true;
            txthienthi.setText(hienThi);
            txtketqua.setText(ketQua);
        }
        if (id == R.id.btn_dauphay) {
            if (trangthai == false) {
                hienThi = "0.";
                luuso1 = luuso2 = 0;
                ketQua = "";
                temp = "0.";
                trangthai = true;
            } else if ((hienThi.equals("") && trangthai == true) || temp.equals("")) {
                hienThi = hienThi + "0.";
                temp = "0.";
            } else {
                if (temp.indexOf(".") == -1) {
                    hienThi = hienThi + ".";
                    temp = temp + ".";
                }
            }
            txthienthi.setText(hienThi);
            txtketqua.setText(ketQua);
        }

        if (id == R.id.btn_congtru) {
            if (trangthai == false) {
                luuso1 = luuso1 * (-1);
                hienThi = luuso1 + "";
                ketQua = luuso1 + "";
                temp = "0";
                trangthai = true;
            } else if (hienThi == "Không thực hiên được" || hienThi.equals("")) {
                hienThi = "-";
                temp = "-";
            } else if (temp.equals(""))
                temp = "-";
            else {
                hienThi = hienThi.substring(0, hienThi.length() - temp.length());
                temp = "-" + temp;
                hienThi += temp;
            }
            trangthai = true;
            txthienthi.setText(hienThi);
            txtketqua.setText(ketQua);
        }
        if (id == R.id.btn_dauphantram) {
            if (trangthai == true) {
                hienThi += "%";
                temp = Double.parseDouble(temp) / 100 + "";
            } else {
                hienThi += "%";
                luuso1 = luuso1 / 100;
                ketQua = luuso1 + "";
                temp = "";
            }
            txthienthi.setText(hienThi);
            txtketqua.setText(ketQua);
        }
        if (id == R.id.btn_AC) {
            if (trangthai == false) {
                hienThi = "";
                ketQua = "";
                luuso1 = luuso2 = 0;
                pheptinh1 = pheptinh2 = "";
            } else if (temp != "") {
                hienThi = hienThi.substring(0, hienThi.length() - temp.length());
                temp = "";
            } else if (temp == "" && pheptinh1 != "") {
                hienThi = luuso1 + "";
                pheptinh1 = "";
            } else if (temp == "" && pheptinh1 == "") {
                hienThi = "";
                ketQua = "";
                luuso1 = luuso2 = 0;
                trangthai = false;
                pheptinh1 = pheptinh2 = "";
            }
            txthienthi.setText(hienThi);
            txtketqua.setText(ketQua);
        }
    }

    @Override
    public boolean onLongClick(View v) {
        hienThi = ketQua = "";
        txthienthi.setText(hienThi);
        txtketqua.setText(ketQua);
        return false;
    }
}
