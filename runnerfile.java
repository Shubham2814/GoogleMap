package com.map.runner;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.map.utils.DBQueries;
import com.map.utils.Driver;

    public class RunnerFile {
        @Test
        public void test() throws Throwable {
            Main.main(new String[]{
                    "--threads", "1",
                    "-g", "com/map/stepdefination",
                    "-p","pretty",
                    "-p","json:target/cucumberreport.json",
                    "-p","html:target/site/cucumber-report-html",
                    "-p","usage:target/cucumber-usage.json",
                    "-p","pretty:target/cucumber-pretty.txt",
                    "--tags", "@GoogleMap",
                    "classpath:features/AutomatedFeatureFiles",
                    "--no-dry-run"
            });
        }

    }
