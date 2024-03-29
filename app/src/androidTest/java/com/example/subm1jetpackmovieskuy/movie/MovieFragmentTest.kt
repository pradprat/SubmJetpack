package com.example.subm1jetpackmovieskuy.movie

//import androidx.test.espresso.contrib.RecyclerViewActions

import RecyclerViewItemCountAssertion
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.IdlingRegistry
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.isDisplayed
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.rule.ActivityTestRule
import com.example.subm1jetpackmovieskuy.MainActivity
import com.example.subm1jetpackmovieskuy.R
import com.example.subm1jetpackmovieskuy.utils.EspressoIdlingResource
import org.junit.After
import org.junit.Before
import org.junit.Rule
import org.junit.Test

//@RunWith(AndroidJUnit4::class)
class MovieFragmentTest {

    @Rule
    @JvmField
    var activityTestRule = ActivityTestRule(MainActivity::class.java)

    @Before
    fun setUp() {
        IdlingRegistry.getInstance().register(EspressoIdlingResource.getEspressoIdlingResource)

        activityTestRule.activity
                .fragmentManager.beginTransaction()
    }
    @After
    fun tearDown() {
        IdlingRegistry.getInstance().unregister(EspressoIdlingResource.getEspressoIdlingResource)
    }

    @Test
    fun MovieRecyclerViewTest() {
//        § Membuka MovieFragment

//        § Memastikan MovieFragment menampilkan RecyclerView
        onView(withId(R.id.rvMovie)).check(matches(isDisplayed()))

//        § Memastikan RecyclerView menampilkan jumlah item yang sesuai dengan yang diharapkan
        onView(withId(R.id.rvMovie)).check((RecyclerViewItemCountAssertion(20)))
    }
}