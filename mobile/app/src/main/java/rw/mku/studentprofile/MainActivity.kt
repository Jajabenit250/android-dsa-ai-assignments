package rw.mku.studentprofile

import android.app.Activity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val name = findViewById<EditText>(R.id.full_name)
        val registration = findViewById<EditText>(R.id.registration)
        val programme = findViewById<EditText>(R.id.programme)
        val result = findViewById<TextView>(R.id.result)

        findViewById<Button>(R.id.submit).setOnClickListener {
            val missing = listOf(name, registration, programme).firstOrNull { it.text.isBlank() }
            if (missing != null) {
                missing.error = getString(R.string.required)
                missing.requestFocus()
            } else {
                result.text = getString(R.string.profile, name.text.trim(),
                    registration.text.trim(), programme.text.trim())
            }
        }
    }
}
