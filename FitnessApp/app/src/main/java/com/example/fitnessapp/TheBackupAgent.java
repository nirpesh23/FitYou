package com.example.fitnessapp;

import android.app.backup.BackupAgentHelper;
import android.app.backup.FileBackupHelper;

public class TheBackupAgent extends BackupAgentHelper {

    static final String Values_to_save = "1";

    String FILES_BACKUP_KEY = "myfiles";
    @Override
    public void onCreate() {
        FileBackupHelper helper = new FileBackupHelper(this, Values_to_save);
        addHelper(FILES_BACKUP_KEY, helper);
    }
}
