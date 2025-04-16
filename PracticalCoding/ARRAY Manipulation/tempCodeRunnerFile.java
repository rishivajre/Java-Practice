return IntStream.range(0, arr.length)
                        .map(i -> arr[arr.length-1-i])
                        .toArray();