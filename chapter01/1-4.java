bucket =FindBucket(key);
if(bucket!=Null)assert(!bucket->IsOccupied());

// "hash=(65599*hash)+c"の高速版
hash=(hash<<6)+(hash<<16)-hash+c;