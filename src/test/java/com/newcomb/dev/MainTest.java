package com.newcomb.dev;

import com.newcomb.dev.controller.TaskApp;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    public TaskApp taskApp = new TaskApp();

    @Test
    void main() {
        taskApp.run();
    }
}