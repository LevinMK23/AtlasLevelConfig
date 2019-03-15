package com.acid.atlaslevelconfig;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import com.acid.atlaslevelconfig.LevelUtility.Continent;
import com.acid.atlaslevelconfig.LevelUtility.Level;
import com.acid.atlaslevelconfig.LevelUtility.LevelConfig;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        LevelConfig config = new LevelConfig();
        File dir = getFilesDir();
        File data = new File(dir, "input.txt");
        try{
            loadData(data, config);
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }
    }

    private void loadData(File data, LevelConfig config) throws FileNotFoundException {
        boolean isDone = false;
        if(!data.exists()){
            try {
                isDone = data.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        if(data.length() == 0){
            config.updateConfig(data);
        }else {
            config.initConfig(data);
        }
    }
}
