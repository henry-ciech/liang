package eu.ciechanowiec.liang.chapter09_listing.listing_9_3_4;

class TestTV {

    public static void main(String[] args) {
        TV tv1 = new TV();
        tv1.turnOn();
        tv1.setChannel(30);
        tv1.setVolume(3);

        TV tv2 = new TV();
        tv2.turnOn();
        tv2.channelUp();
        tv2.channelUp();
        tv2.volumeUp();

        System.out.printf("tv1's channel is %d nd volume is %d%n", tv1.channel, tv1.volumeLevel);
        System.out.printf("tv2's channel is %d nd volume is %d%n", tv2.channel, tv2.volumeLevel);
    }
}
