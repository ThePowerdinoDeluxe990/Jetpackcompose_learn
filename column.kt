@Preview(showBackground = true, backgroundColor = 0xFFFFFFFF, device = "id:pixel_2" , showSystemUi = true)
@Composable
fun BoxTest(){
    MyApplicationTheme {
        Row(
            modifier = Modifier.fillMaxSize(),
            horizontalArrangement = Arrangement.SpaceEvenly,
            verticalAlignment = Alignment.CenterVertically
        ){
            Greeting(name = "Jesus",
                modifier= Modifier
                    .background(Color.LightGray)
            )
            Greeting(name = "Android",
                modifier = Modifier
                    .background(Color.Yellow)
            )

        }
    }
}
