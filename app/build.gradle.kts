plugins {
    alias(libs.plugins.android.application)
}

android {
    namespace = "com.example.retrofit1"
    compileSdk = 35

    defaultConfig {
        applicationId = "com.example.retrofit1"
        minSdk = 24
        targetSdk = 35
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
}

dependencies {

    implementation(libs.appcompat)
    implementation(libs.material)
    implementation(libs.activity)
    implementation(libs.constraintlayout)
    testImplementation(libs.junit)
    androidTestImplementation(libs.ext.junit)
    androidTestImplementation(libs.espresso.core)

    // retrofits
    // retrofit
    // Retrofit本体 (最新安定版)
    implementation ("com.squareup.retrofit2:retrofit:2.11.0")

    // RetrofitのGsonコンバーター (Retrofit本体のバージョンに合わせる)
    implementation ("com.squareup.retrofit2:converter-gson:2.11.0")

    // Gsonライブラリ本体 (converter-gsonが内部で持っていることが多いが、明示的に指定する場合)
    // converter-gson:2.11.0 は Gson 2.10.1 に依存しています
    // そのため、明示的に指定するなら 2.10.1 以上が適切です。
    // 不要な場合は削除しても構いません。
    implementation ("com.google.code.gson:gson:2.10.1") // または 2.10.1 より新しい安定版

}