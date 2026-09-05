class fizzbuzz {
    public static void main(String[] args) {
        for(int n = 0; n <= 20; n++){ 
            if(n%3==0 && n%5==0){
                System.out.println("fizzbuzz");
            } else if( n%3==0){ 
                System.out.println("fizz");
            }else if (n % 5==0){ 
                System.out.println("buzz");
            }else{
                System.out.println(n);
            }
        }
    }
}