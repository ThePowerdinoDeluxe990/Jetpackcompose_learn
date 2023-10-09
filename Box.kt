@Preview(showBackground = true, backgroundColor = 0xFFFFFFFF, device = "id:pixel_2" , showSystemUi = true)
@Composable
fun BoxTest(){
    MyApplicationTheme {
        Box(
            modifier = Modifier
                .fillMaxSize(),
            contentAlignment = Alignment.Center

        ){
            Greeting(name = "Jesus")
            Greeting(name = "Android", modifier = Modifier.align(Alignment.BottomEnd))
        }
    }
}



@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}
