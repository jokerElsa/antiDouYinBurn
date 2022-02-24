test = findViewById(R.id.testJ);
test.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(final View v) {
        v.setBackgroundColor(getColor(R.color.red));
        v.setVisibility(View.GONE);
        v.postDelayed(new Runnable() {
            @Override
            public void run() {
                v.setVisibility(View.VISIBLE);
            }
        },5000);
    }
});
addClose(test, ALIGN_PARENT_RIGHT, 500);
addClose(test, ALIGN_PARENT_LEFT, 500);
 

RelativeLayout test;
private void addClose(final RelativeLayout test, int rule, int width){
    Button button = new Button(this);
    RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(width,MATCH_PARENT);
    layoutParams.addRule(rule);
    button.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            test.setBackgroundColor(getColor(R.color.blue));
        }
    });
    test.addView(button, layoutParams);
}
