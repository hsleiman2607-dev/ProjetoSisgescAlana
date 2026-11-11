plugins {
    alias(libs.plugins.android.application)
}

android {
    namespace = "com.example.projetosisgescalana"
    compileSdk {
        version = release(37)
    }

    defaultConfig {
        applicationId = "com.example.projetosisgescalana"
        minSdk = 24
        targetSdk = 37
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            optimization {
                enable = true
                packageScope = setOf("androidx.**", "kotlin.**", "kotlinx.**")
            }
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
}

dependencies {
    implementation(libs.activity.ktx)
    implementation(libs.appcompat)
    implementation(libs.constraintlayout)

    implementation(project(":core:navigation"))
    implementation(project(":feature:perfila"))
    implementation(project(":feature:perfilb"))
    implementation(project(":feature:perfilc"))


    implementation(libs.material)
    testImplementation(libs.junit)
    androidTestImplementation(libs.espresso.core)
    androidTestImplementation(libs.ext.junit)
}