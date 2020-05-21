package com.example.myapplication5

import android.content.Intent
import android.graphics.Color
import android.os.Bundle
import android.support.v7.app.ActionBarActivity
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.core.content.ContextCompat


class MainActivity : ActionBarActivity() {
    // Объявляем об использовании следующих объектов:
    private var username: EditText? = null
    private var password: EditText? = null
    private var login: Button? = null
    private var loginLocked: TextView? = null
    protected fun onCreate (savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Связываемся с элементами нашего интерфейса:
        username = findViewById(R.id.edit_user) as EditText?
        password = findViewById(R.id.edit_password) as EditText?
        login = findViewById(R.id.button_login) as Button?
        loginLocked = findViewById(R.id.login_locked) as TextView?
        attempts = findViewById(R.id.attempts) as TextView?
    }
    // Обрабатываем нажатие кнопки "Войти":
    fun Login(view: View?) {
        // Если введенный логин и пароль будет удовлетворять заданному выраңению
        // показываем Toast сообщение об успешном входе:
        if (username!!.text.toString().toRegex("[a-z&&[@]&&[bk||mail||gmail||yandex||rambler]&&[.][ru||com]]") && password!!.text.toString().toRegex("[[[1-9]&&[a-z]&&[A-Z]]>=6]")) {
            Toast.makeText(ApplicationProvider.getApplicationContext(), "Вход выполнен!", Toast.LENGTH_SHORT).show()

            // Выполняем переход на другой экран:
            val intent = Intent(this@MainActivity, Second::class.java)
            ContextCompat.startActivity(intent)} else {
            Toast.makeText(ApplicationProvider.getApplicationContext(), "Неправильные данные!", Toast.LENGTH_SHORT).show()
            }
        }
    }



