import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.CalendarView;
import android.widget.TextView;
public class MainActivity extends AppCompatActivity {
   CalendarView calendar;
   TextView dateView;
   @Override
   protected void onCreate(Bundle savedInstanceState) {
      super.onCreate(savedInstanceState);
      setContentView(R.layout.activity_main);
      calendar = findViewById(R.id.calender);
      dateView = findViewById(R.id.dateView);
      calendar.setOnDateChangeListener(new CalendarView.OnDateChangeListener() {
         @Override
         public void onSelectedDayChange(@NonNull CalendarView view, int year, int month, int dayOfMonth) {
            String Date = dayOfMonth + "-" + (month + 1) + "-" + year;
            dateView.setText(Date);
         }
      });
   }
}
