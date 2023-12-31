@Suppress("DSL_SCOPE_VIOLATION") // TODO: Remove once KTIJ-19369 is fixed
plugins {
    alias(libs.plugins.androidApplication)
    alias(libs.plugins.kotlinAndroid)
}

android {
    namespace = "com.meteo.programm.weatherapp"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.meteo.programm.weatherapp"
        minSdk = 26
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        vectorDrawables {
            useSupportLibrary = true
        }
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
    kotlinOptions {
        jvmTarget = "1.8"
    }
    buildFeatures {
        compose = true
    }
    composeOptions {
        kotlinCompilerExtensionVersion = "1.5.3"
    }
    packaging {
        resources {
            excludes += "/META-INF/{AL2.0,LGPL2.1}"
        }
    }
}

dependencies {

    implementation(libs.androidx.appcompat)
    val paging_version = "3.2.1"
    val compose_version = "1.1.0"

    implementation("io.insert-koin:koin-android:3.1.2")
    implementation("androidx.paging:paging-runtime:$paging_version")
    implementation("androidx.paging:paging-rxjava2:$paging_version")
    implementation("androidx.paging:paging-rxjava3:$paging_version")
    implementation("androidx.paging:paging-guava:$paging_version")
    implementation("androidx.paging:paging-compose:3.3.0-alpha02")
    implementation("androidx.compose.runtime:runtime:1.5.3")
    implementation("androidx.compose.runtime:runtime-livedata:1.5.3")
    implementation("androidx.compose.runtime:runtime-rxjava2:1.5.3")
    implementation("org.jetbrains.kotlinx:kotlinx-serialization-json:1.5.1")
    implementation(libs.core.ktx)
    implementation(libs.lifecycle.runtime.ktx)
    implementation(libs.activity.compose)
    implementation(platform(libs.compose.bom))
    implementation(libs.ui)
    implementation(libs.ui.graphics)
    implementation(libs.ui.tooling.preview)
    implementation(libs.material3)
    runtimeOnly("androidx.core:core-splashscreen:1.0.0")
    runtimeOnly("androidx.annotation:annotation:1.7.0")
    testImplementation(libs.junit)
    testImplementation("androidx.paging:paging-common:$paging_version")
    androidTestImplementation(libs.androidx.test.ext.junit)
    androidTestImplementation(libs.espresso.core)
    androidTestImplementation(platform(libs.compose.bom))
    androidTestImplementation(libs.ui.test.junit4)
    debugImplementation(libs.ui.tooling)
    debugImplementation(libs.ui.test.manifest)

    implementation("androidx.compose.ui:ui-tooling:$compose_version")
    debugImplementation("androidx.compose.ui:ui-tooling-preview:$compose_version")

    implementation("androidx.compose.ui:ui-tooling")
    debugImplementation("androidx.compose.ui:ui-tooling-preview")
}