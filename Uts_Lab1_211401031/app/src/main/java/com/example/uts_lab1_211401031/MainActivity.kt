package com.example.uts_lab1_211401031

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private lateinit var recyclerViewGo: RecyclerView
    private lateinit var popularList:ArrayList<Popular>
    private lateinit var popularAdapter: PopularAdapter

    private lateinit var recyclerViewCa: RecyclerView
    private lateinit var categoryList:ArrayList<Category>
    private lateinit var categoryAdapter: CategoryAdapter

    private lateinit var recyclerViewPo: RecyclerView
    private lateinit var goalList:ArrayList<Goal>
    private lateinit var goalAdapter: GoalAdapter

    private lateinit var recyclerViewMe: RecyclerView
    private lateinit var mealList:ArrayList<Meal>
    private lateinit var mealAdapter: MealAdapter

    private lateinit var recyclerViewAdd: RecyclerView
    private lateinit var additionalList:ArrayList<Additional>
    private lateinit var additionalAdapter: AdditionalAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        init()
    }

    private fun init(){
        recyclerViewGo = findViewById(R.id.recycler_goal)
        recyclerViewGo.setHasFixedSize(true)
        recyclerViewGo.layoutManager = LinearLayoutManager(this , RecyclerView.HORIZONTAL , false)
        goalList = ArrayList()

        recyclerViewCa = findViewById(R.id.recycler_category)
        recyclerViewCa.setHasFixedSize(true)
        recyclerViewCa.layoutManager = LinearLayoutManager(this , RecyclerView.HORIZONTAL , false)
        categoryList = ArrayList()

        recyclerViewPo = findViewById(R.id.recycler_popular)
        recyclerViewPo.setHasFixedSize(true)
        recyclerViewPo.layoutManager = LinearLayoutManager(this , RecyclerView.VERTICAL , false)
        popularList = ArrayList()

        recyclerViewMe = findViewById(R.id.recycle_meal)
        recyclerViewMe.setHasFixedSize(true)
        recyclerViewMe.layoutManager = LinearLayoutManager(this , RecyclerView.VERTICAL , false)
        mealList = ArrayList()

        recyclerViewAdd = findViewById(R.id.recycle_additional)
        recyclerViewAdd.setHasFixedSize(true)
        recyclerViewAdd.layoutManager = LinearLayoutManager(this , RecyclerView.VERTICAL , false)
        additionalList = ArrayList()

        addDatatoList()

        goalAdapter = GoalAdapter(goalList)
        recyclerViewGo.adapter = goalAdapter

        categoryAdapter = CategoryAdapter(categoryList)
        recyclerViewCa.adapter = categoryAdapter

        popularAdapter = PopularAdapter(popularList)
        recyclerViewPo.adapter = popularAdapter

        mealAdapter = MealAdapter(mealList)
        recyclerViewMe.adapter = mealAdapter

        additionalAdapter = AdditionalAdapter(additionalList)
        recyclerViewAdd.adapter = additionalAdapter
    }


    private fun addDatatoList(){
        goalList.add(Goal("Loose Weight"))
        goalList.add(Goal("Gain Weight"))
        goalList.add(Goal("Body Building"))
        goalList.add(Goal("Healthy"))

        categoryList.add(Category(R.drawable.yoga, "Yoga"))
        categoryList.add(Category(R.drawable.gym, "Gym"))
        categoryList.add(Category(R.drawable.cardio, "Cardio"))
        categoryList.add(Category(R.drawable.stretch, "Stretch"))
        categoryList.add(Category(R.drawable.fullbody, "Full Body"))

        popularList.add(Popular(R.drawable.barbel_train, "Full Shot Woman Stretching Arm", "30 min"))
        popularList.add(Popular(R.drawable.supriseface, "Athlete Practicing Monochrome", "50 min"))

        mealList.add(Meal(R.drawable.greek_salad, "Greek salad with lettuce, green onion, ", "150 Kcal"))
        mealList.add(Meal(R.drawable.fresh_salad, "Salad of fresh vegetables", "270 Kcal"))

        additionalList.add(Additional(R.drawable.additional_1, R.drawable.additional1, "Exercises with Jumping Rope","110 Kcal", "10 min"))
        additionalList.add(Additional(R.drawable.additional_2, R.drawable.additional21, "Exercises with Holding Jumping Rope","135 Kcal", "8 min"))
        additionalList.add(Additional(R.drawable.additional_3, R.drawable.additional3, "Exercises with Sitting Dumbbells","135 Kcal", "5 min"))
    }
}