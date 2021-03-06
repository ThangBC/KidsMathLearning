package com.kml.KidsMathLearning;

import android.content.DialogInterface;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import java.util.Random;

public class DoVuiActivity extends AppCompatActivity {
    ImageView imageViewQuayLai, imgDA1DV, imgDA2DV, imgDA3DV, imgDamMay1DV, imgDamMay2DV, imgDamMay3DV;
    int i = 1;
    int Tong = 2;
    int dung;
    int sai;
    TextView cauHoiDoVui, tvDoVui;
    public static MediaPlayer mediaPlayer0, mediaPlayer1, mediaPlayer2, mediaPlayer3, mediaPlayer4, mediaPlayer5,
            mediaPlayer6, mediaPlayer7, mediaPlayer8, mediaPlayer9, mediaPlayer10, mediaPlayer11, mediaPlayer12,
            mediaPlayer13, mediaPlayer14, mediaPlayer15, mediaPlayer16, mediaPlayer17, mediaPlayer18, mediaPlayer19,
            mediaPlayer20, mediaPlayer21,mediaPlayer22,mediaPlayer23,mediaPlayer24;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_do_vui);
        cauHoiDoVui = findViewById(R.id.tvCauHoiDoVui);
        tvDoVui = findViewById(R.id.tvDoVui);
        imgDA1DV = findViewById(R.id.imgDapAn1DV);
        imgDA2DV = findViewById(R.id.imgDapAn2DV);
        imgDA3DV = findViewById(R.id.imgDapAn3DV);
        imgDamMay1DV = findViewById(R.id.imgDamMay1DV);
        imgDamMay2DV = findViewById(R.id.imgDamMay2DV);
        imgDamMay3DV = findViewById(R.id.imgDamMay3DV);
        imageViewQuayLai = findViewById(R.id.imgQuayLaiCuaMHDoVui);
        mediaPlayer0 = MediaPlayer.create(this, R.raw.cau0);
        mediaPlayer1 = MediaPlayer.create(this, R.raw.cau1);
        mediaPlayer2 = MediaPlayer.create(this, R.raw.cau2);
        mediaPlayer3 = MediaPlayer.create(this, R.raw.cau3);
        mediaPlayer4 = MediaPlayer.create(this, R.raw.cau4);
        mediaPlayer5 = MediaPlayer.create(this, R.raw.cau5);
        mediaPlayer6 = MediaPlayer.create(this, R.raw.cau6);
        mediaPlayer7 = MediaPlayer.create(this, R.raw.cau7);
        mediaPlayer8 = MediaPlayer.create(this, R.raw.cau8);
        mediaPlayer9 = MediaPlayer.create(this, R.raw.cau9);
        mediaPlayer10 = MediaPlayer.create(this, R.raw.cau10);
        mediaPlayer11 = MediaPlayer.create(this, R.raw.cau11);
        mediaPlayer12 = MediaPlayer.create(this, R.raw.cau12);
        mediaPlayer13 = MediaPlayer.create(this, R.raw.cau13);
        mediaPlayer14 = MediaPlayer.create(this, R.raw.cau14);
        mediaPlayer15 = MediaPlayer.create(this, R.raw.cau15);
        mediaPlayer16 = MediaPlayer.create(this, R.raw.cau16);
        mediaPlayer17 = MediaPlayer.create(this, R.raw.cau17);
        mediaPlayer18 = MediaPlayer.create(this, R.raw.cau18);
        mediaPlayer19 = MediaPlayer.create(this, R.raw.cau19);
        mediaPlayer20 = MediaPlayer.create(this, R.raw.amthanhhuongdan);
        mediaPlayer22 = MediaPlayer.create(this, R.raw.amthanhdung);
        mediaPlayer23 = MediaPlayer.create(this, R.raw.amthanhsai);
        mediaPlayer24 = MediaPlayer.create(this, R.raw.chucmung);
        mediaPlayer20.start();
        DialogHDLam();
        //??nh x???
        imgDA1DV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (Tong == 0 || Tong == 3 || Tong == 6 || Tong == 9) {
                    mediaPlayer22.start();
                    imgDamMay1DV.setImageResource(R.drawable.anhxanh);
                    imgDamMay2DV.setImageResource(R.drawable.maydo);
                    imgDamMay3DV.setImageResource(R.drawable.maydo);
                    dung++;
                    DoVuiActivity.MyRunnable myRunnable = new DoVuiActivity.MyRunnable();
                    myRunnable.start();
                } else {
                    mediaPlayer23.start();
                    imgDamMay1DV.setImageResource(R.drawable.maydo);
                    sai++;
                    DoVuiActivity.MyRunnable myRunnable = new DoVuiActivity.MyRunnable();
                    myRunnable.start();
                }
                Service();
            }
        });

        imgDA2DV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (Tong == 1 || Tong == 4 || Tong == 7) {
                    mediaPlayer22.start();
                    imgDamMay2DV.setImageResource(R.drawable.anhxanh);
                    imgDamMay1DV.setImageResource(R.drawable.maydo);
                    imgDamMay3DV.setImageResource(R.drawable.maydo);
                    dung++;
                    DoVuiActivity.MyRunnable myRunnable = new DoVuiActivity.MyRunnable();
                    myRunnable.start();
                } else {
                    mediaPlayer23.start();
                    imgDamMay2DV.setImageResource(R.drawable.maydo);
                    sai++;
                    DoVuiActivity.MyRunnable myRunnable = new DoVuiActivity.MyRunnable();
                    myRunnable.start();
                }
                Service();
            }
        });
        imgDA3DV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (Tong == 2 || Tong == 5 || Tong == 8) {
                    mediaPlayer22.start();
                    imgDamMay3DV.setImageResource(R.drawable.anhxanh);
                    imgDamMay2DV.setImageResource(R.drawable.maydo);
                    imgDamMay1DV.setImageResource(R.drawable.maydo);
                    dung++;
                    DoVuiActivity.MyRunnable myRunnable = new DoVuiActivity.MyRunnable();
                    myRunnable.start();
                } else {
                    mediaPlayer23.start();
                    imgDamMay3DV.setImageResource(R.drawable.maydo);
                    sai++;
                    DoVuiActivity.MyRunnable myRunnable = new DoVuiActivity.MyRunnable();
                    myRunnable.start();
                }
                Service();
            }
        });
        //Chuy???n m??n h??nh
        //Quay l???i:
        imageViewQuayLai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tatAm();
                mediaPlayer21 = MediaPlayer.create(DoVuiActivity.this, R.raw.quaylai);
                mediaPlayer21.start();
                AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(DoVuiActivity.this);
                alertDialogBuilder.setView(R.layout.dialog_quay_lai);
                alertDialogBuilder.setTitle("B?? ch???c ch??? ?");
                alertDialogBuilder
                        .setCancelable(false)
                        .setNegativeButton("Quay l???i", new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int id) {
                                Intent intentQuayLai = new Intent(DoVuiActivity.this, ManHinhChinhActivity.class);
                                ManHinhChaoActivity.mediaPlayer.start();
                                mediaPlayer21.pause();
                                startActivity(intentQuayLai);
                            }
                        })
                        .setPositiveButton("H???y", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                mediaPlayer21.pause();
                                dialogInterface.cancel();
                            }
                        });

                AlertDialog alertDialog = alertDialogBuilder.create();
                alertDialog.show();
            }
        });
    }

    public void myRandomCauHoi() {
        int cauHoi;
        Random random = new Random();
        cauHoi = random.nextInt(20);
        switch (cauHoi) {
            case 0:
                cauHoiDoVui.setText("??i???n s??? th??ch h???p v??o ch??? tr???ng (...): \n 5+4-... = 5+1");
                mediaPlayer0 = MediaPlayer.create(this, R.raw.cau0);
                mediaPlayer0.start();
                Tong = 3;
                Log.e("AAA", "so 0");
                break;
            case 1:
                cauHoiDoVui.setText("Nh?? b???n Huy nu??i 7 con g??, m??? b???n Huy b??n ??i 6 con g??. H???i nh?? \n b???n Huy c??n t???t c??? bao nhi??u con g?? ?");
                mediaPlayer1 = MediaPlayer.create(this, R.raw.cau1);
                mediaPlayer1.start();
                Tong = 1;
                Log.e("AAA", "so 1");
                break;
            case 2:
                cauHoiDoVui.setText("????n g?? nh?? Lan m???i ng??y ????? ???????c 5 qu??? tr???ng, m??? r??n 2 qu???, c??n l???i \n m??? mang ra ch??? b??n. H???i m??? Lan mang ??i b??n m???y qu??? tr???ng ?");
                mediaPlayer2 = MediaPlayer.create(this, R.raw.cau2);
                mediaPlayer2.start();
                Tong = 3;
                Log.e("AAA", "so 2");
                break;
            case 3:
                cauHoiDoVui.setText("M??? mua cho Bi 5 qu??? b??ng bay, b??? mua th??m cho Bi 2 qu???. h???i Bi c?? bao nhi??u b??ng bay ?");
                mediaPlayer3 = MediaPlayer.create(this, R.raw.cau3);
                mediaPlayer3.start();
                Log.e("AAA", "so 3");
                Tong = 7;
                break;
            case 4:
                cauHoiDoVui.setText("??i???n s??? th??ch h???p v??o ch??? tr???ng (...): \n 5+2=...-1");


                mediaPlayer4 = MediaPlayer.create(this, R.raw.cau4);
                mediaPlayer4.start();
                Log.e("AAA", "so 4");
                Tong = 8;
                break;
            case 5:
                cauHoiDoVui.setText("??i???n s??? th??ch h???p v??o ch??? tr???ng (...): \n 5+...=7-4+3");
                mediaPlayer5 = MediaPlayer.create(this, R.raw.cau5);
                mediaPlayer5.start();
                Log.e("AAA", "so 5");
                Tong = 1;
                break;
            case 6:
                cauHoiDoVui.setText("Mai c?? 8 qu??? t??o. Mai cho Hoa v?? B??nh m???i b???n 4. V???y Mai c??n l???i bao nhi??u qu??? t??o ?");
                mediaPlayer6 = MediaPlayer.create(this, R.raw.cau6);
                mediaPlayer6.start();
                Log.e("AAA", "so 6");
                Tong = 0;
                break;
            case 7:
                cauHoiDoVui.setText("T??m m???t s??? bi???t s??? ???? c???ng v???i 3 ???????c s??? li???n tr?????c c???a 8");
                mediaPlayer7 = MediaPlayer.create(this, R.raw.cau7);
                mediaPlayer7.start();
                Log.e("AAA", "so 7");
                Tong = 4;
                break;
            case 8:
                cauHoiDoVui.setText("C?? gi??o c?? 2 ph???n qu??, c?? t???ng cho b?? 1 ph???n qu??. H???i c?? c??n l???i bao nhi??u ph???n qu??? ?");
                mediaPlayer8 = MediaPlayer.create(this, R.raw.cau8);
                mediaPlayer8.start();
                Log.e("AAA", "so 8");
                Tong = 1;
                break;
            case 9:
                cauHoiDoVui.setText("Th??y c?? 5 ????i g??ng tay, Th??y cho ch??? 3 ????i. H???i Th??y c??n bao nhi??u ????i g??ng tay ?");
                mediaPlayer9 = MediaPlayer.create(this, R.raw.cau9);
                mediaPlayer9.start();
                Log.e("AAA", "so 9");
                Tong = 2;
                break;
            case 10:
                cauHoiDoVui.setText("Nh?? An c?? 6 con g?? tr???ng v?? 1 g?? m??i. H???i s??? g?? tr???ng nhi???u h??n s??? g?? m??i bao nhi??u con ?");
                mediaPlayer10 = MediaPlayer.create(this, R.raw.cau10);
                mediaPlayer10.start();
                Log.e("AAA", "so 10");
                Tong = 5;
                break;
            case 11:
                cauHoiDoVui.setText("??i???n s??? th??ch h???p v??o ch??? tr???ng (...): \n 3+6=...");
                mediaPlayer11 = MediaPlayer.create(this, R.raw.cau11);
                mediaPlayer11.start();
                Log.e("AAA", "so 11");
                Tong = 9;
                break;
            case 12:
                cauHoiDoVui.setText("Lan c?? 3 chi???c gi??y, Linh c?? 3 chi???c gi??y. H???i c??? hai b???n c?? t???t c??? c?? bao nhi??u chi???c gi??y ? ");
                mediaPlayer12 = MediaPlayer.create(this, R.raw.cau12);
                mediaPlayer12.start();
                Log.e("AAA", "so 12");
                Tong = 6;
                break;
            case 13:
                cauHoiDoVui.setText("An ??n h???t 5 qu??? t??o, B??nh ??n h???t 1 qu??? t??o. H???i c??? hai b???n ??n h???t bao nhi??u qu??? t??o ?");
                mediaPlayer13 = MediaPlayer.create(this, R.raw.cau13);
                mediaPlayer13.start();
                Log.e("AAA", "so 13");
                Tong = 6;
                break;
            case 14:
                cauHoiDoVui.setText("M??? c?? 5 c??i k???o chia cho 2 anh em. Anh ???????c ??t h??n em 1 c??i. H???i anh ???????c bao nhi??u c??i k???o ?");
                mediaPlayer14 = MediaPlayer.create(this, R.raw.cau14);
                mediaPlayer14.start();
                Log.e("AAA", "so 14");
                Tong = 2;
                break;
            case 15:
                cauHoiDoVui.setText("c?? 9 t??ch c?? ph??, ch??? c?? 1 c??i mu???ng. V???y c??n thi???u bao nhi??u c??i mu???ng ?");
                mediaPlayer15 = MediaPlayer.create(this, R.raw.cau15);
                mediaPlayer15.start();
                Log.e("AAA", "so 15");
                Tong = 8;
                break;
            case 16:
                cauHoiDoVui.setText("B?? c?? 6 qu??? b??ng, b?? cho b??? 3 qu??? b??ng. H???i b?? c??n l???i m???y qu??? b??ng ?");
                mediaPlayer16 = MediaPlayer.create(this, R.raw.cau16);
                mediaPlayer16.start();
                Log.e("AAA", "so 16");
                Tong = 3;
                break;
            case 17:
                cauHoiDoVui.setText("H????ng c?? 2 b??ng hoa, Lan c?? 7 b??ng hoa. H???i c??? hai b???n c?? bao nhi??u b??ng hoa ?");
                mediaPlayer17 = MediaPlayer.create(this, R.raw.cau17);
                mediaPlayer17.start();
                Log.e("AAA", "so 17");
                Tong = 9;
                break;
            case 18:
                cauHoiDoVui.setText("Hoa c?? 4 qu??? b??ng bay, Hoa nh??? tay l??m v??? 3 qu???, h???i Hoa c??n bao nhi??u qu??? b??ng bay ?");
                mediaPlayer18 = MediaPlayer.create(this, R.raw.cau18);
                mediaPlayer18.start();
                Log.e("AAA", "so 18");
                Tong = 1;
                break;
            case 19:
                cauHoiDoVui.setText("H???ng c?? 9 c??i k???o, H???ng cho Mai 3 c??i, cho Lan 3 c??i. H???i H???ng c??n l???i bao nhi??u c??i k???o ?");
                mediaPlayer19 = MediaPlayer.create(this, R.raw.cau19);
                mediaPlayer19.start();
                Log.e("AAA", "so 19");
                Tong = 3;
                break;
        }
    }

    public void myRandomDapAn(int Tong) {
        switch (Tong) {
            case 0:
                imgDA1DV.setImageResource(R.drawable.so0);
                break;
            case 1:
                imgDA2DV.setImageResource(R.drawable.so1);
                break;
            case 2:
                imgDA3DV.setImageResource(R.drawable.so2);
                break;
            case 3:
                imgDA1DV.setImageResource(R.drawable.so3);
                break;
            case 4:
                imgDA2DV.setImageResource(R.drawable.so4);
                break;
            case 5:
                imgDA3DV.setImageResource(R.drawable.so5);
                break;
            case 6:
                imgDA1DV.setImageResource(R.drawable.so6);
                break;
            case 7:
                imgDA2DV.setImageResource(R.drawable.so7);
                break;
            case 8:
                imgDA3DV.setImageResource(R.drawable.so8);
                break;
            case 9:
                imgDA1DV.setImageResource(R.drawable.so9);
                break;
        }
    }

    private class MyRunnable extends Thread {
        @Override
        public void run() {
            try {
                Thread.sleep(500);
                imgDamMay3DV.setImageResource(R.drawable.dammay);
                imgDamMay2DV.setImageResource(R.drawable.dammay);
                imgDamMay1DV.setImageResource(R.drawable.dammay);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void DialogHDLam() {
        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(DoVuiActivity.this);
        alertDialogBuilder.setView(R.layout.dialog_hddovui);
        alertDialogBuilder.setTitle("H?????ng d???n");
        alertDialogBuilder
                .setCancelable(false)
                .setNegativeButton("Ti???p t???c", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        dialog.cancel();
                        mediaPlayer20.pause();
                        mediaPlayer9 = MediaPlayer.create(DoVuiActivity.this, R.raw.cau9);
                        mediaPlayer9.start();
                    }
                });

        AlertDialog alertDialog = alertDialogBuilder.create();
        alertDialog.show();
    }

    public void Service() {
            myRandomCauHoi();
            myRandomDapAn(Tong);
            Log.e("BBB", "tong 3:  " + Tong);
            i++;
            tvDoVui.setText("C??u " + i + "/10");
        if (i > 10) {
            tvDoVui.setText("K???t th??c");
            tatAm();
            mediaPlayer24.start();
            AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(DoVuiActivity.this);
            final View view1 = LayoutInflater.from(DoVuiActivity.this).inflate(R.layout.dialog_ket_qua, null);
            alertDialogBuilder.setCancelable(false);
            alertDialogBuilder.setView(view1);
            AlertDialog alertDialog = alertDialogBuilder.create();
            alertDialog.show();
            Button choiLai = view1.findViewById(R.id.Again);
            Button quayLai = view1.findViewById(R.id.menu);
            TextView cauDung = view1.findViewById(R.id.tvCauDung);
            TextView cauSai = view1.findViewById(R.id.tvCauSai);
            cauDung.setText("S??? c??u ????ng: " + dung);
            cauSai.setText("S??? c??u sai: " + sai);
            choiLai.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    i = 1;
                    dung = 0;
                    sai = 0;
                    tvDoVui.setText("C??u " + i + "/10");
                    mediaPlayer24.pause();
                    alertDialog.cancel();
                    myRandomCauHoi();
                    myRandomDapAn(Tong);

                }
            });
            quayLai.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(DoVuiActivity.this, ManHinhChinhActivity.class);
                    ManHinhChaoActivity.mediaPlayer.start();
                    mediaPlayer24.pause();
                    startActivity(intent);
                }
            });

        }
        Log.e("AAA", "????ng: " + dung);
        Log.e("AAA", "Sai: " + sai);
    }

    public void tatAm(){
        mediaPlayer0.pause();
        mediaPlayer1.pause();
        mediaPlayer2.pause();
        mediaPlayer3.pause();
        mediaPlayer4.pause();
        mediaPlayer5.pause();
        mediaPlayer6.pause();
        mediaPlayer7.pause();
        mediaPlayer8.pause();
        mediaPlayer9.pause();
        mediaPlayer10.pause();
        mediaPlayer11.pause();
        mediaPlayer12.pause();
        mediaPlayer13.pause();
        mediaPlayer14.pause();
        mediaPlayer15.pause();
        mediaPlayer16.pause();
        mediaPlayer17.pause();
        mediaPlayer18.pause();
        mediaPlayer19.pause();
    }
}