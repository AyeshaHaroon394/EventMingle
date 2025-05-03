// Top-level build file where you can add configuration options common to all sub-projects/modules.

plugins {
    // Your existing Android plugin alias
    alias(libs.plugins.android.application) apply false

    // Firebase Google Services plugin (added here, but not applied yet)
    id("com.google.gms.google-services") version "4.4.2" apply false
}
