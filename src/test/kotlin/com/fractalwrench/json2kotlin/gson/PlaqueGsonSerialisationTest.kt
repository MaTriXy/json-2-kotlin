package com.fractalwrench.json2kotlin.gson

import com.fractalwrench.json2kotlin.valid.GithubProjectExample
import com.fractalwrench.json2kotlin.valid.PlaqueExample
import com.google.gson.Gson
import org.junit.Assert
import org.junit.Test

class PlaqueGsonSerialisationTest : AbstractSerialisationTest() {

    override fun filename() = "Plaque"

    @Test
    override fun testGsonSerialisation() {
        val gson = Gson().fromJson(json, PlaqueExample::class.java)
        Assert.assertNotNull(gson)



        Assert.fail()
    }

}