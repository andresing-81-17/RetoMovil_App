package jaw.androidw.regitro_app;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {

    private BottomNavigationView bottonNav;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bottonNav = findViewById(R.id.bottonContainer);
        bottonNav.setOnItemSelectedListener(item -> {
            Fragment selectedFragment = null;
            switch (item.getItemId()){
                case R.id.navRegister:
                    Log.d("[FRAGMENT CHANGE]","LOADING CREATE USER");
                    selectedFragment = new CreateUser();
                    break;
                case R.id.navListUser:
                    Log.d("[FRAGMENT CHANGE]","LOADING LIST USER");
                    selectedFragment = new ListUserCreate();
                    break;
                case R.id.navInformation:
                    Log.d("[FRAGMENT CHANGE]","LOADING INFO USER");
                    selectedFragment = new InformationUser();
                    break;
            }
            getSupportFragmentManager().beginTransaction().replace(R.id.fragmentContainer,selectedFragment).commit();
            return true;
        });
        getSupportFragmentManager().beginTransaction().replace(R.id.fragmentContainer,new CreateUser()).commit();
    }
}