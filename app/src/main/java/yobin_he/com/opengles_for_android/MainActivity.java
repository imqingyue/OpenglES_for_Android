package yobin_he.com.opengles_for_android;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import yobin_he.com.opengles_for_android.airhockey.AirHockeyActivity;
import yobin_he.com.opengles_for_android.airhockey_1.AirHockeyActivity1;
import yobin_he.com.opengles_for_android.airhockey_3d.AirHockey3dActivity;
import yobin_he.com.opengles_for_android.airhockey_ortho.AirHockeyOrthoActivity;
import yobin_he.com.opengles_for_android.airhockey_textured.AirHockeyTexturedActivity;
import yobin_he.com.opengles_for_android.airhockey_touch.AirHockeyTouchActivity;
import yobin_he.com.opengles_for_android.airhockey_touch.AirHockeyTouchRender;
import yobin_he.com.opengles_for_android.airhokey_mallets.AirHockeyMalletsdActivity;
import yobin_he.com.opengles_for_android.first_project.FirstOpenGlesActivity;
import yobin_he.com.opengles_for_android.particles.ParticleActivity;

public class MainActivity extends BaseActivity implements View.OnClickListener {
    private Context mContext;
    private Button btn_air_hockey;
    private Button btn_first_project;
    private Button btn_air_hockey_1;
    private Button btn_air_hockey_ortho;
    private Button btn_air_hockey_3d;
    private Button btn_air_hockey_textured;
    private Button btn_air_hockey_mallet;
    private Button btn_air_hockey_touch;
    private Button btn_particle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.mContext = this;
        initView();
        initListener();

    }
    private void initView() {
        btn_first_project = findViewById(R.id.btn_first_project);
        btn_air_hockey = findViewById(R.id.btn_air_hockey);
        btn_air_hockey_1 = findViewById(R.id.btn_air_hockey_1);
        btn_air_hockey_ortho = findViewById(R.id.btn_air_hockey_ortho);
        btn_air_hockey_3d = findViewById(R.id.btn_air_hockey_3d);
        btn_air_hockey_textured  = findViewById(R.id.btn_air_hockey_textured);
        btn_air_hockey_mallet = findViewById(R.id.btn_air_hockey_mallet);
        btn_air_hockey_touch = findViewById(R.id.btn_air_hockey_touch);
        btn_particle = findViewById(R.id.btn_particle);
    }

    private void initListener() {
        btn_first_project.setOnClickListener(this);
        btn_air_hockey.setOnClickListener(this);
        btn_air_hockey_1.setOnClickListener(this);
        btn_air_hockey_ortho.setOnClickListener(this);
        btn_air_hockey_3d.setOnClickListener(this);
        btn_air_hockey_textured.setOnClickListener(this);
        btn_air_hockey_mallet.setOnClickListener(this);
        btn_air_hockey_touch.setOnClickListener(this);
        btn_particle.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn_first_project: //跳转第一个opengl程序
                startActivity(new Intent(mContext, FirstOpenGlesActivity.class));
                break;
            case R.id.btn_air_hockey: // 跳转曲棍球页面
                startActivity(new Intent(mContext, AirHockeyActivity.class));
                break;
            case R.id.btn_air_hockey_1: //增加颜色和着色。
                startActivity(new Intent(mContext, AirHockeyActivity1.class));
                break;

            case R.id.btn_air_hockey_ortho: //增加相应的矩阵变换。
                startActivity(new Intent(mContext, AirHockeyOrthoActivity.class));
                break;
            case R.id.btn_air_hockey_3d://3d效果，增加透视矩阵
                startActivity(new Intent(mContext, AirHockey3dActivity.class));
                break;
            case R.id.btn_air_hockey_textured: // 增加纹理
                startActivity(new Intent(mContext, AirHockeyTexturedActivity.class));
                break;

            case R.id.btn_air_hockey_mallet: //改进相应的球拍
                startActivity(new Intent(mContext, AirHockeyMalletsdActivity.class));
                break;
            case R.id.btn_air_hockey_touch:
                startActivity(new Intent(mContext, AirHockeyTouchActivity.class));
                break;
            case R.id.btn_particle:
                startActivity(new Intent(mContext, ParticleActivity.class));
                break;
        }
    }
}
